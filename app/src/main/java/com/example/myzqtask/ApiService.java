package com.example.myzqtask;

import com.example.myzqtask.bean.CatalogListBean;
import com.example.myzqtask.bean.CatalogTabBean;
import com.example.myzqtask.bean.CategoryListBean;
import com.example.myzqtask.bean.CategoryTabBean;
import com.example.myzqtask.bean.IndexBean;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    String getbannerurl="https://cdwan.cn/";
    @GET("index")
    Observable<Bean> getJson();

    String getUrl="https://cdwan.cn/api/";
    //主页数据接口
    @GET("index")
    Observable<IndexBean> getIndexData();

    //获取分类导航数据接口
    @GET("catalog/index")
    Observable<CatalogTabBean> getCatalogTabData();

    //获取列表选中的数据
    @GET("catalog/current")
    Observable<CatalogListBean> getCatalogList(@Query("id") int id);

    //获取分类Tab数据的接口goods/category { id: this.data.id }
    @GET("goods/category")
    Observable<CategoryTabBean> getCategoryTab();

    //商品分类列表数据goods/list{categoryId: that.data.id, page: that.data.page, size: that.data.size}
    @GET("goods/list")
    Observable<CategoryListBean> getCategoryList(@Query("categoryId") int categoryId, @Query("page") int page, @Query("size") int size);

}
