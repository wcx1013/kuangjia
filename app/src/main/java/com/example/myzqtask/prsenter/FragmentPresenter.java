package com.example.myzqtask.prsenter;

import com.example.myzqtask.Bean;
import com.example.myzqtask.model.FragmentModel;
import com.example.myzqtask.view.FragmentView;

import java.util.List;

public class FragmentPresenter implements FragmentModel.FragmentCallback {
   private  FragmentModel fragmentModel;
   private FragmentView fragmentView;

    public FragmentPresenter( FragmentView fragmentView) {
        this.fragmentModel = new FragmentModel();
        this.fragmentView = fragmentView;
    }
    public void setData(){
        fragmentModel.setJson(this);
    }
    @Override
    public void onSuccess(List<Bean.DataBean.BannerBean> bannerBeanList) {
        fragmentView.setBanner(bannerBeanList);
    }

    @Override
    public void onSuccess2(List<Bean.DataBean.ChannelBean> channelBeans) {
        fragmentView.setBanner2(channelBeans);
    }

    @Override
    public void onSuccess3(List<Bean.DataBean.BrandListBean> brandListBeans) {
            fragmentView.setBanner3(brandListBeans);
    }

    @Override
    public void onSuccess4(List<Bean.DataBean.HotGoodsListBean> hotGoodsListBeans) {
        fragmentView.setBanner4(hotGoodsListBeans);
    }

    @Override
    public void Fail(String str) {

    }
}
