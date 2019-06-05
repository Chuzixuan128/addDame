package com.example.lenovo.myapplication.utils;

import android.widget.Toast;

import com.example.lenovo.myapplication.Base.BaseApplication;

public class ToastUtil {
    public static void showShort(String msg){

        Toast.makeText(BaseApplication.getBaseApplication(),msg,Toast.LENGTH_SHORT).show();
    }
    public static void showLong(String msg){

        Toast.makeText(BaseApplication.getBaseApplication(),msg,Toast.LENGTH_LONG).show();
    }
}
