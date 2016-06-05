package com.yunos.tv.androidlib.presenter;


import com.yunos.tv.androidlib.ui.BaseView;


/**
 * Created by Anthony on 2016/5/4.
 * Class Note:
 * check whether the View attached in the MVP
 *
 */
public interface BasePresenter {
    /**
     * 注入View，使之能够与View相互响应
     *
     * @param view
     */
    void attachView(BaseView view);

    /**
     * 释放资源
     */
    void detachView();
}

