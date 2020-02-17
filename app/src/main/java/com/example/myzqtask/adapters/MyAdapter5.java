package com.example.myzqtask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myzqtask.Bean5;
import com.example.myzqtask.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter5 extends RecyclerView.Adapter {
    private ArrayList<Bean5> list;
    private Context context;

    public MyAdapter5(ArrayList<Bean5> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout5, parent, false);
        MyHolder myHolder = new MyHolder(inflate);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder= (MyHolder) holder;
        Glide.with(context).load(list.get(position).getImage()).into(myHolder.im);
        myHolder.na.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView na;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
             im = itemView.findViewById(R.id.im6);
             na = itemView.findViewById(R.id.tv6);
        }
    }
}
