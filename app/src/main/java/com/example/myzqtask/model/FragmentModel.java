package com.example.myzqtask.model;

import com.example.myzqtask.ApiService;
import com.example.myzqtask.Bean;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentModel {
    public void setJson(FragmentCallback fragmentCallback){
        Retrofit build = new Retrofit.Builder()
                .baseUrl(ApiService.getbannerurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService = build.create(ApiService.class);
        Observable<Bean> json = apiService.getJson();
        json.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        List<Bean.DataBean.BannerBean> banner = bean.getData().getBanner();
                        fragmentCallback.onSuccess(banner);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Retrofit build2 = new Retrofit.Builder()
                .baseUrl(ApiService.getbannerurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService2 = build2.create(ApiService.class);
        Observable<Bean> json2 = apiService2.getJson();
        json2.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        List<Bean.DataBean.ChannelBean> channel = bean.getData().getChannel();
                        fragmentCallback.onSuccess2(channel);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Retrofit build3 = new Retrofit.Builder()
                .baseUrl(ApiService.getbannerurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService3 = build3.create(ApiService.class);
        Observable<Bean> json3 = apiService3.getJson();
        json3.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        List<Bean.DataBean.BrandListBean> brandList = bean.getData().getBrandList();
                        fragmentCallback.onSuccess3(brandList);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Retrofit build4 = new Retrofit.Builder()
                .baseUrl(ApiService.getbannerurl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService4 = build4.create(ApiService.class);
        Observable<Bean> json4 = apiService4.getJson();
        json4.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Bean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Bean bean) {
                        List<Bean.DataBean.HotGoodsListBean> hotGoodsList = bean.getData().getHotGoodsList();
                        fragmentCallback.onSuccess4(hotGoodsList);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    public interface FragmentCallback{
        void onSuccess(List<Bean.DataBean.BannerBean> bannerBeanList);
        void onSuccess2(List<Bean.DataBean.ChannelBean> channelBeans);
        void onSuccess3(List<Bean.DataBean.BrandListBean> brandListBeans);
        void onSuccess4(List<Bean.DataBean.HotGoodsListBean> hotGoodsListBeans);

        void Fail(String str);
    }


}
