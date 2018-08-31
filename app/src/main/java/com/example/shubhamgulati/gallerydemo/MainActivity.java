package com.example.shubhamgulati.gallerydemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.mzelzoghbi.zgallery.ZGallery;
import com.mzelzoghbi.zgallery.ZGrid;
import com.mzelzoghbi.zgallery.entities.ZColor;
import com.stfalcon.frescoimageviewer.ImageViewer;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<images> imagesArrayList = new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        btn = findViewById(R.id.btn);
        rv=findViewById(R.id.rv);
        imagesArrayList.add(new images(R.drawable.w7));
        imagesArrayList.add(new images(R.drawable.w8));
        imagesArrayList.add(new images(R.drawable.w8));
        imagesArrayList.add(new images(R.drawable.w9));
        imagesArrayList.add(new images(R.drawable.w10));
        imagesArrayList.add(new images(R.drawable.w11));
        imagesArrayList.add(new images(R.drawable.w13));
        imagesArrayList.add(new images(R.drawable.w9));
        imagesArrayList.add(new images(R.drawable.w9));
        imagesArrayList.add(new images(R.drawable.w9));
        imagesArrayList.add(new images(R.drawable.w14));
        Adapter adapter = new Adapter(this,imagesArrayList);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv.setAdapter(adapter);
        rv.setItemViewCacheSize(20);
        rv.setDrawingCacheEnabled(true);
        rv.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
        rv.setLayoutManager(gridLayoutManager);
//        rv.addOnItemTouchListener(new RecyclerItemTouchListener());

    }


}
