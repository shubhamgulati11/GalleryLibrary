package com.example.shubhamgulati.gallerydemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    Context cxt;
    ArrayList<images> imageArraylist;
    LayoutInflater li;
    ImageView ivFrag;
    public Adapter(Context cxt, ArrayList<images> imageArraylist) {
        this.cxt = cxt;
        this.imageArraylist = imageArraylist;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        li = LayoutInflater.from(cxt);
        View view = li.inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final Adapter.ViewHolder holder, final int position) {
        final images i = imageArraylist.get(position);
//        Picasso.get().load(i.getImage()).placeholder(R.drawable.ic_launcher_foreground).into(holder.iv);
        Glide.with(cxt).load(i.getImage())
                .thumbnail(0.5f)
                .apply(new RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL))
                .into(holder.iv);

        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(cxt, DetailActivity.class);
                i.putParcelableArrayListExtra("data", imageArraylist);
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
