package com.example.myzqtask;


import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myzqtask.adapters.MyAdapter5;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment5 extends Fragment {


    private RecyclerView recyc5;
    private ImageView im5;

    public BlankFragment5() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment5, container, false);
    }

    @SuppressLint("CheckResult")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyc5 = getView().findViewById(R.id.recyc5);
        im5 = getView().findViewById(R.id.im5);
//        RequestOptions requestOptions = new RequestOptions();
//        RequestOptions options = requestOptions.circleCrop();
//        im5.setAnimation();
       //Glide.with(getContext()).load(im5).apply(options).into(im5);
        // StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL);
        GridLayoutManager manager = new GridLayoutManager(getContext(), 3);
      // recyc5.addItemDecoration(new GridDivider(getContext(),20, Drawable.createFromPath()));
        recyc5.setLayoutManager(manager);

        ArrayList<Bean5> list = new ArrayList<>();
        list.add(new Bean5(R.mipmap.chat,"我的订单"));
        list.add(new Bean5(R.mipmap.chat,"优惠卷"));
        list.add(new Bean5(R.mipmap.chat,"礼品卡"));
        list.add(new Bean5(R.mipmap.chat,"我的收藏"));
        list.add(new Bean5(R.mipmap.chat,"我的足迹"));
        list.add(new Bean5(R.mipmap.chat,"会员福利"));
        list.add(new Bean5(R.mipmap.chat,"地址管理"));
        list.add(new Bean5(R.mipmap.chat,"账号安全"));
        list.add(new Bean5(R.mipmap.chat,"联系客服"));
        list.add(new Bean5(R.mipmap.chat,"帮助中心"));
        list.add(new Bean5(R.mipmap.chat,"意见反馈"));
        MyAdapter5 myAdapter5 = new MyAdapter5(list, getContext());
        recyc5.setAdapter(myAdapter5);

    }
}
