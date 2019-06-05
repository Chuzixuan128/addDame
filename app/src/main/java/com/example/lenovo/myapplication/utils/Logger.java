package com.example.lenovo.myapplication.utils;

import android.util.Log;

import butterknife.BuildConfig;


public class Logger {

    public static void logD(String tag,String msg){
        if (BuildConfig.DEBUG){
            Log.d(tag, "LogD: "+msg);
        }
    }
}
