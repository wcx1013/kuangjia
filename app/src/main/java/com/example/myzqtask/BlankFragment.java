package com.example.myzqtask;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myzqtask.adapters.BanAdapter;
import com.example.myzqtask.adapters.MyAdapter3;
import com.example.myzqtask.prsenter.FragmentPresenter;
import com.example.myzqtask.view.FragmentView;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment implements FragmentView {


    private ArrayList<Bean.DataBean.BannerBean> banlist;
    private Banner ban;
    private BanAdapter banAdapter;
    private ArrayList<Bean.DataBean.ChannelBean> channelBeanss;
    private MyPager2 myPager2;
    private RecyclerView recyc;
    private ViewPager pager2;
    private TabLayout tab;
    private RecyclerView recyc2;
    private ArrayList<Bean.DataBean.HotGoodsListBean> hotGoodsListBeanss;
    private MyAdapter3 myAdapter3;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ban = getView().findViewById(R.id.ban);

        pager2 = getView().findViewById(R.id.pager2);
        tab = getView().findViewById(R.id.tab);
        recyc2 = getView().findViewById(R.id.recyc2);
        banlist = new ArrayList<>();
        banAdapter = new BanAdapter();
        FragmentPresenter fragmentPresenter = new FragmentPresenter(this);
        fragmentPresenter.setData();

        ban.setImages(banlist).setImageLoader(banAdapter).start();
        channelBeanss = new ArrayList<>();

        myPager2 = new MyPager2(getChildFragmentManager(), channelBeanss);
        pager2.setAdapter(myPager2);
        tab.setupWithViewPager(pager2);


        LinearLayoutManager manager1 = new LinearLayoutManager(getContext());
        recyc2.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        recyc2.setLayoutManager(manager1);
        hotGoodsListBeanss = new ArrayList<>();
        myAdapter3 = new MyAdapter3(hotGoodsListBeanss,getContext());
        recyc2.setAdapter(myAdapter3);
    }

    @Override
    public void setBanner(List<Bean.DataBean.BannerBean> bannerlist) {
      banlist.clear();
        banlist.addAll(bannerlist);
    }

    @Override
    public void setBanner2(List<Bean.DataBean.ChannelBean> channelBeans) {
        channelBeanss.clear();
        channelBeanss.addAll(channelBeans);
        myPager2.notifyDataSetChanged();
    }

    @Override
    public void setBanner3(List<Bean.DataBean.BrandListBean> brandListBeans) {

    }

    @Override
    public void setBanner4(List<Bean.DataBean.HotGoodsListBean> hotGoodsListBeans) {
        hotGoodsListBeanss.clear();
        hotGoodsListBeanss.addAll(hotGoodsListBeans);
        myAdapter3.notifyDataSetChanged();
    }
}
