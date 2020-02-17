package com.example.myzqtask.adapters;

import android.content.Context;
import android.text.Html;
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

public class MyAdapter3 extends RecyclerView.Adapter {
    private ArrayList<Bean.DataBean.HotGoodsListBean> list;
    private Context context;

    public MyAdapter3(ArrayList<Bean.DataBean.HotGoodsListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout3, parent, false);
        MyHolder myHolder = new MyHolder(inflate);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyHolder myHolder= (MyHolder) holder;
        Glide.with(context).load(list.get(position).getList_pic_url()).into(myHolder.im);
        myHolder.tv1.setText(list.get(position).getGoods_brief());
        myHolder.tv2.setText(list.get(position).getRetail_price());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    class  MyHolder extends RecyclerView.ViewHolder {
        ImageView im;
        TextView tv1;
        TextView tv2;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
             im = itemView.findViewById(R.id.im3);
            tv1 = itemView.findViewById(R.id.tv1);
            tv2 = itemView.findViewById(R.id.tv2);
        }
    }
}
