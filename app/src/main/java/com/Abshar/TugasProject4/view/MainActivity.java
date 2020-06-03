package com.Abshar.TugasProject4.view;

import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import com.Abshar.TugasProject4.adapter.TvShowRecyclerAdapter;
import com.Abshar.TugasProject4.repository.TvShowRepository;
import com.Abshar.TugasProject4.R;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TvShowRecyclerAdapter adapter;
    private GridLayoutManager layoutManager;
    private TvShowRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("TV SHOW");

        init();

        repository = TvShowRepository.getInstance();
        adapter.setData(repository.getData());
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    private void init(){
        recyclerView = findViewById(R.id.recyclerView);

        layoutManager = new GridLayoutManager(this, 1);
        adapter = new TvShowRecyclerAdapter();
        adapter.init(MainActivity.this,layoutManager);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.about){
            startActivity(new Intent(MainActivity.this, About.class));
        }
        if (id == R.id.action_list_to_grid) {
            if (!((Animatable) item.getIcon()).isRunning()) {
                if (layoutManager.getSpanCount() == 1) {
                    item.setIcon(AnimatedVectorDrawableCompat.create(MainActivity.this, R.drawable.list_to_grid));
                    layoutManager.setSpanCount(2);
                } else {
                    item.setIcon(AnimatedVectorDrawableCompat.create(MainActivity.this, R.drawable.grid_to_list));
                    layoutManager.setSpanCount(1);
                }
                ((Animatable) item.getIcon()).start();
                adapter.notifyItemRangeChanged(0, adapter.getItemCount());
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
