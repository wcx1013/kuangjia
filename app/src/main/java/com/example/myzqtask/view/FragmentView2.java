package com.example.myzqtask.view;

import com.example.myzqtask.bean.CatalogListBean;
import com.example.myzqtask.bean.CatalogTabBean;
import com.example.myzqtask.bean.CategoryTabBean;

import java.util.List;

public interface FragmentView2 {
    void setData(List<CatalogTabBean.DataBean.CategoryListBean> catalogTabBeans);
    void setData2(List<CategoryTabBean.DataBean.BrotherCategoryBean> categoryTabBeans);

}
