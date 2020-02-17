package com.example.myzqtask;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import q.rorbin.verticaltablayout.VerticalTabLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myzqtask.bean.CatalogItem;
import com.example.myzqtask.bean.CatalogTabBean;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment3 extends Fragment {


    private VerticalTabLayout verticalTabLayout;
    private ImageView img;
    private TextView txtDesc;
    private TextView txtTitle;
   private RecyclerView recyclerView;
  private   List<String> titles;

  private   List<CatalogItem> list;
   // CatalogAdapter catalogAdapter;
    //竖导航的列表
    List<CatalogTabBean.DataBean.CategoryListBean> categoryList;

    public BlankFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        verticalTabLayout = getView().findViewById(R.id.verticalTab);
        img = getView().findViewById(R.id.img);
        txtTitle = getView().findViewById(R.id.txt_title);
        txtDesc = getView().findViewById(R.id.txt_desc);
        recyclerView = getView().findViewById(R.id.recyclerview);

        titles = new ArrayList<>();

        list = new ArrayList<>();
    }
}
