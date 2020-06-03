package com.Abshar.TugasProject4.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.Abshar.TugasProject4.R;
import com.Abshar.TugasProject4.helper.TvShowRecyclerViewHolder;
import com.Abshar.TugasProject4.model.TvShow;
import com.Abshar.TugasProject4.view.Detail;

import java.util.ArrayList;
import java.util.List;

public class TvShowRecyclerAdapter extends RecyclerView.Adapter<TvShowRecyclerViewHolder> {
    private Context context;
    private List<TvShow> list = new ArrayList<>();
    private GridLayoutManager gridLayoutManager;
    private View view;

    public void init(Context context, GridLayoutManager gridLayoutManager){
        this.context = context;
        this.gridLayoutManager = gridLayoutManager;
    }

    public void setData(List<TvShow> list){
        this.list = list;
    }

    @Override
    public int getItemViewType(int position) {
        int spanCount = gridLayoutManager.getSpanCount();
        if (spanCount == 1){
            return 1;
        }else {
            return 2;
        }
    }

    @NonNull
    @Override
    public TvShowRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 1){
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_mode, parent, false);
        }else{
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_mode, parent, false);
        }
        TvShowRecyclerViewHolder vh = new TvShowRecyclerViewHolder(view, viewType);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull final TvShowRecyclerViewHolder holder, int position) {
        Glide.with(context)
                .load(list.get(position).getImgUrl())
                .into(holder.image);

        if (holder.getItemViewType() == 1){
            holder.detail.setText(list.get(position).getDetail());
            holder.title.setText(list.get(position).getTitle());
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(context, Detail.class);
                    i.putExtra("position", holder.getAdapterPosition());
                    context.startActivity(i);
                }
            });
            holder.btn_hapus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    list.remove(holder.getAdapterPosition());
                    notifyItemRemoved(holder.getAdapterPosition());
                }
            });
        }else{
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context.getApplicationContext(),holder.title.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            });
            holder.title.setText(list.get(position).getTitle());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
