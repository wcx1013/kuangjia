package com.example.myzqtask;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.tab)
    TabLayout tab;
    @BindView(R.id.tuoba)
    Toolbar tuoba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initview();
    }

    private void initview() {
        tuoba.setTitle("仿网易严选");
        setSupportActionBar(tuoba);
        String[] title = {"首页", "专题", "分类", "购物车", "我的"};
        FragmentManager manager = getSupportFragmentManager();
        ArrayList<Fragment> fragments = new ArrayList<>();
        BlankFragment blankFragment = new BlankFragment();
        BlankFragment2 blankFragment2 = new BlankFragment2();
        BlankFragment3 blankFragment3 = new BlankFragment3();
        BlankFragment4 blankFragment4 = new BlankFragment4();
        BlankFragment5 blankFragment5 = new BlankFragment5();
        fragments.add(blankFragment);
        fragments.add(blankFragment2);
        fragments.add(blankFragment3);
        fragments.add(blankFragment4);
        fragments.add(blankFragment5);
        MyPager myPager = new MyPager(manager, fragments, title);
        vp.setAdapter(myPager);
        tab.setupWithViewPager(vp);
        tab.getTabAt(0).setIcon(R.drawable.dw_0);
        tab.getTabAt(1).setIcon(R.drawable.dw_1);
        tab.getTabAt(2).setIcon(R.drawable.dw_2);
        tab.getTabAt(3).setIcon(R.drawable.dw_3);
        tab.getTabAt(4).setIcon(R.drawable.dw_4);
        tab.setTabTextColors(Color.BLACK, Color.RED);


    }
}
