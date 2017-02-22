package com.bwie.shopmap;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
*1.类的用途
*2.zhanghaisheng
*3.2017/2/22
**/

public class ShopApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
    }
}
