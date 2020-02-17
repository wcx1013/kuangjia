package com.example.myzqtask.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myzqtask.Bean;
import com.example.myzqtask.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter1 extends RecyclerView.Adapter {
    private ArrayList<Bean.DataBean.BrandListBean> list;
    private Context context;

    public MyAdapter1(ArrayList<Bean.DataBean.BrandListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout1, parent, false);
        MyHolder myHolder = new MyHolder(inflate);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
            MyHolder myHolder= (MyHolder) holder;
        Glide.with(context).load(list.get(position).getNew_pic_url()).into(myHolder.im);
        myHolder.name2.setText(list.get(position).getName());
        myHolder.name.setText(list.get(position).getFloor_price());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class MyHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView name;
        TextView name2;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
             im = itemView.findViewById(R.id.im);
             name = itemView.findViewById(R.id.tx);
             name2 = itemView.findViewById(R.id.tx2);
        }
    }
}
