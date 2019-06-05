package com.example.lenovo.myapplication.utils;

import android.os.Environment;

import com.example.lenovo.myapplication.Base.BaseApplication;

import java.io.File;

public interface AppConstants {


    String PATH_SDCARD = Environment.getExternalStorageDirectory().getAbsolutePath() +
            File.separator + "code" + File.separator + "GeekNews";

    String FILE_PROVIDER_AUTHORITY="com.baidu.geek.fileprovider";

    String PATH_DATA = BaseApplication.getBaseApplication().getCacheDir().getAbsolutePath() +
            File.separator + "data";

    String PATH_CACHE = PATH_DATA + "/NetCache";

}
