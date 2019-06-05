package com.example.lenovo.myapplication.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initMvp();
        initView();
        initData();
        initListener();
    }

    protected void initMvp() {

    }

    protected void initListener() {

    }

    protected void initData() {

    }

    protected void initView() {

    }

    protected abstract int getLayoutId();
}
