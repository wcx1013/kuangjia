package com.example.myzqtask;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPager2 extends FragmentPagerAdapter {
    private ArrayList<Bean.DataBean.ChannelBean> list;

    public MyPager2(FragmentManager fm, ArrayList<Bean.DataBean.ChannelBean> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return new BlankFragment6();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).getName();
    }
}
