package com.example.myzqtask.prsenter;

import com.example.myzqtask.Bean;
import com.example.myzqtask.model.FragmentModel1;
import com.example.myzqtask.view.FragmentView1;

import java.util.List;
import java.util.PropertyResourceBundle;

public class FragmentPresenter1 implements FragmentModel1.FragmentCallback {
    private FragmentModel1 fragmentModel1;
    private FragmentView1 fragmentView1;

    public FragmentPresenter1( FragmentView1 fragmentView1) {
        this.fragmentModel1 = new FragmentModel1();
        this.fragmentView1 = fragmentView1;
    }
    public void setData(){
        fragmentModel1.setJson(this);
    }
    @Override
    public void onSuccess(List<Bean.DataBean.TopicListBean> bannerBeanList) {
        fragmentView1.setBanner(bannerBeanList);
    }

    @Override
    public void Fail(String str) {

    }
}
