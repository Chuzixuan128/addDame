package com.example.lenovo.myapplication.view;

import com.example.lenovo.myapplication.Base.BaseView;
import com.example.lenovo.myapplication.Bean.Bean;

public interface ReimengView extends BaseView {
    void onSuccess(Bean bean);

    void onFail(String msg);
}
