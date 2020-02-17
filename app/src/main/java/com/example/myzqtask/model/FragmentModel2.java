package com.example.myzqtask.model;

import com.example.myzqtask.ApiService;
import com.example.myzqtask.bean.CatalogTabBean;
import com.example.myzqtask.bean.CategoryTabBean;

import java.time.Instant;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class FragmentModel2 {
    public void setJson(FenleiCallback fenleiCallback){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.getUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService = retrofit.create(ApiService.class);
        Observable<CatalogTabBean> catalogTabData = apiService.getCatalogTabData();
        catalogTabData.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CatalogTabBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CatalogTabBean catalogTabBean) {
                        List<CatalogTabBean.DataBean.CategoryListBean> categoryList = catalogTabBean.getData().getCategoryList();
                        fenleiCallback.OnSuccess(categoryList);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl(ApiService.getUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        ApiService apiService2 = retrofit2.create(ApiService.class);
        Observable<CategoryTabBean> categoryTab = apiService2.getCategoryTab();
        categoryTab.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CategoryTabBean>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(CategoryTabBean categoryTabBean) {
                        List<CategoryTabBean.DataBean.BrotherCategoryBean> brotherCategory = categoryTabBean.getData().getBrotherCategory();
                        fenleiCallback.OnSuccess2(brotherCategory);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }
    public interface FenleiCallback{
        void OnSuccess(List<CatalogTabBean.DataBean.CategoryListBean> catalogTabBeans);
        void OnSuccess2(List<CategoryTabBean.DataBean.BrotherCategoryBean> categoryTabBeans);
    }
}
