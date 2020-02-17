package com.example.myzqtask;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myzqtask.adapters.MyAdapter2;
import com.example.myzqtask.prsenter.FragmentPresenter;
import com.example.myzqtask.prsenter.FragmentPresenter1;
import com.example.myzqtask.view.FragmentView1;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment implements FragmentView1 {



    private RecyclerView recyc;
    private ArrayList<Bean.DataBean.TopicListBean> topicListBeanss;
    private MyAdapter2 myAdapter2;



    public BlankFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        recyc = getView().findViewById(R.id.recyc);

        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyc.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        recyc.setLayoutManager(manager);
        topicListBeanss = new ArrayList<>();
        FragmentPresenter1 fragmentPresenter1 = new FragmentPresenter1(this);
        fragmentPresenter1.setData();
        myAdapter2 = new MyAdapter2(topicListBeanss,getContext());
        recyc.setAdapter(myAdapter2);
    }

    @Override
    public void setBanner(List<Bean.DataBean.TopicListBean> topicListBeans) {
        topicListBeanss.clear();
        topicListBeanss.addAll(topicListBeans);
        myAdapter2.notifyDataSetChanged();
    }
}
