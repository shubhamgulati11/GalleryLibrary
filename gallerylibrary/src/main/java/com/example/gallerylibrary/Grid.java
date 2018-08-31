package com.example.gallerylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Grid extends AppCompatActivity {

    ArrayList<images> imagesArrayList = new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);
        imagesArrayList=getIntent().getParcelableArrayListExtra("key");
        rv = findViewById(R.id.rv);
//        GridAdapter adapter = new GridAdapter(this,imagesArrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        rv.setAdapter(adapter);
        rv.setItemViewCacheSize(20);
        rv.setDrawingCacheEnabled(true);
        rv.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        rv.setLayoutManager(gridLayoutManager);

    }
}