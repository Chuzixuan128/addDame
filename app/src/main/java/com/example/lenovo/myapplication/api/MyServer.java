package com.example.lenovo.myapplication.api;

import com.example.lenovo.myapplication.Bean.Bean;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MyServer {

    String Urll = "http://news-at.zhihu.com/";

    @GET("api/4/sections")
    Observable<Bean> getData();
}
