package com.example.lenovo.myapplication.presenter;

import com.example.lenovo.myapplication.Base.BaseCallBack;
import com.example.lenovo.myapplication.Base.BasePresenter;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.model.ReimengM;
import com.example.lenovo.myapplication.view.ReimengView;

public class ReimengP extends BasePresenter<ReimengM,ReimengView> {

    public void Reimeng() {

        if (myModel != null) {
            myModel.Reidian( new BaseCallBack<Bean>() {
                @Override
                public void onSuccess(Bean bean) {
                    if (myView != null) {
                        myView.onSuccess(bean);
                    }
                }

                @Override
                public void onFail(String msg) {
                    if (myView != null) {
                        myView.onFail(msg);
                    }
                }
            });
        }
    }

}
