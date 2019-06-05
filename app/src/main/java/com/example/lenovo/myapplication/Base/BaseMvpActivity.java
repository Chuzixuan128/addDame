package com.example.lenovo.myapplication.Base;

public abstract class BaseMvpActivity<P extends BasePresenter,M extends BaseModel,V extends BaseView> extends BaseActivity{

protected P myPresenter;

    @Override
    protected void initMvp() {
        super.initMvp();
        myPresenter = initMvpPresenter();

        if (myPresenter != null){
            myPresenter.attachView(initMvpView());
            myPresenter.initModel(initMvpModel());
        }

    }

    protected abstract M initMvpModel();

    protected abstract V initMvpView();

    protected abstract P initMvpPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (myPresenter!=null){
            myPresenter.destory();
            myPresenter = null;
        }

    }
}
