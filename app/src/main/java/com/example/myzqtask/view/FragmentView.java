package com.example.myzqtask.view;

import com.example.myzqtask.Bean;

import java.util.List;

public interface FragmentView {
    void setBanner(List<Bean.DataBean.BannerBean> bannerlist);
    void setBanner2(List<Bean.DataBean.ChannelBean> channelBeans);
    void setBanner3(List<Bean.DataBean.BrandListBean> brandListBeans);
    void setBanner4(List<Bean.DataBean.HotGoodsListBean> hotGoodsListBeans);

}
