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

public class FragmentModel1 {
    public void setJson(FragmentCallback fragmentCallback) {
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
                        List<Bean.DataBean.TopicListBean> topicList = bean.getData().getTopicList();
                        fragmentCallback.onSuccess(topicList);
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
            void onSuccess(List<Bean.DataBean.TopicListBean> bannerBeanList);
            void Fail(String str);
        }

}
