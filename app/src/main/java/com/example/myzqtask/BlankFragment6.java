package com.example.myzqtask;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myzqtask.adapters.MyAdapter1;
import com.example.myzqtask.adapters.MyAdapter3;
import com.example.myzqtask.prsenter.FragmentPresenter;
import com.example.myzqtask.view.FragmentView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment6 extends Fragment implements FragmentView {


    private ArrayList<Bean.DataBean.BrandListBean> brandListBeanss;
    private RecyclerView recyc;
    private MyAdapter1 myAdapter1;
    private RecyclerView recyc2;
    private ArrayList<Bean.DataBean.HotGoodsListBean> hotGoodsListBeanss;
    private MyAdapter3 myAdapter3;

    public BlankFragment6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment6, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        recyc = getView().findViewById(R.id.recyc);

        GridLayoutManager manager = new GridLayoutManager(getContext(), 2);
        recyc.setLayoutManager(manager);
        brandListBeanss = new ArrayList<>();
        FragmentPresenter fragmentPresenter = new FragmentPresenter(this);
        fragmentPresenter.setData();
        myAdapter1 = new MyAdapter1(brandListBeanss,getContext());
        recyc.setAdapter(myAdapter1);


    }

    @Override
    public void setBanner(List<Bean.DataBean.BannerBean> bannerlist) {

    }

    @Override
    public void setBanner2(List<Bean.DataBean.ChannelBean> channelBeans) {

    }

    @Override
    public void setBanner3(List<Bean.DataBean.BrandListBean> brandListBeans) {
            brandListBeanss.clear();
            brandListBeanss.addAll(brandListBeans);
            myAdapter1.notifyDataSetChanged();
    }

    @Override
    public void setBanner4(List<Bean.DataBean.HotGoodsListBean> hotGoodsListBeans) {

    }
}
