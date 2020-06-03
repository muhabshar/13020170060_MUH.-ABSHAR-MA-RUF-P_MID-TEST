package com.Abshar.TugasProject4.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.Abshar.TugasProject4.helper.CastAndCrewViewHolder;
import com.Abshar.TugasProject4.model.CastCrew;
import com.Abshar.TugasProject4.R;

import java.util.ArrayList;
import java.util.List;

public class CastAndCrewAdapter extends RecyclerView.Adapter<CastAndCrewViewHolder> {
    private List<CastCrew> list = new ArrayList<>();
    private Context context;

    public void init(Context context, List<CastCrew> list){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CastAndCrewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cast_and_crew, parent, false);
        CastAndCrewViewHolder vh = new CastAndCrewViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CastAndCrewViewHolder holder, int position) {
        Glide.with(context)
                .load(list.get(position).getImageUrl())
                .into(holder.imageView);

        holder.textView.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
