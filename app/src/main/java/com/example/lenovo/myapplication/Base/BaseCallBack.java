package com.example.lenovo.myapplication.Base;

public interface BaseCallBack<T> {

    void onSuccess(T t);

    void onFail(String msg);

}
