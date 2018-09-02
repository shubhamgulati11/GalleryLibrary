package com.example.gallerylibrary;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    Context cxt;
    ArrayList<String> imageArraylist;
    LayoutInflater li;

    public GridAdapter(Context cxt, ArrayList<String> imageArraylist) {
        this.cxt = cxt;
        this.imageArraylist = imageArraylist;
    }

    @NonNull
    @Override
    public GridAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        li = LayoutInflater.from(cxt);
        View view = li.inflate(R.layout.gridrow,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridAdapter.ViewHolder holder, final int position) {
        String t = imageArraylist.get(position);
        Glide.with(cxt).load(t)
                .thumbnail(0.5f)
                .apply(new RequestOptions()
                        .diskCacheStrategy(DiskCacheStrategy.ALL))
                .into(holder.iv);
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cxt, Views.class);
                i.putStringArrayListExtra("data", imageArraylist);
                i.putExtra("pos", position);
                cxt.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageArraylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv);
        }
    }
}
