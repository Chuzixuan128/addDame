package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.lenovo.myapplication.Base.BaseMvpActivity;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.model.ReimengM;
import com.example.lenovo.myapplication.presenter.ReimengP;
import com.example.lenovo.myapplication.shipeiqi.ReidianMy;
import com.example.lenovo.myapplication.view.ReimengView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseMvpActivity<ReimengP,ReimengM,ReimengView> implements ReimengView {


    @BindView(R.id.rlv)
    RecyclerView mRlv;
    private ArrayList<Bean.DataBean> list;
    private ReidianMy reidianMy;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData() {
        super.initData();
        myPresenter.Reimeng();
    }

    @Override
    protected void initView() {
        super.initView();
        list = new ArrayList<>();
        reidianMy = new ReidianMy(this,list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        mRlv.setLayoutManager(linearLayoutManager);
        mRlv.setAdapter(reidianMy);
    }


    @Override
    protected ReimengM initMvpModel() {
        return new ReimengM();
    }

    @Override
    protected ReimengView initMvpView() {
        return this;
    }

    @Override
    protected ReimengP initMvpPresenter() {
        return new ReimengP();
    }

    @Override
    public void onSuccess(Bean bean) {
        List<Bean.DataBean> data = bean.getData();
        list.addAll(data);
        reidianMy.setList(list);
        reidianMy.notifyDataSetChanged();
    }

    @Override
    public void onFail(String msg) {

    }
}
