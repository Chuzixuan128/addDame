package com.example.lenovo.myapplication.model;

import com.example.lenovo.myapplication.Base.BaseCallBack;
import com.example.lenovo.myapplication.Base.BaseModel;
import com.example.lenovo.myapplication.Bean.Bean;
import com.example.lenovo.myapplication.api.MyServer;
import com.example.lenovo.myapplication.net.BaseObserver;
import com.example.lenovo.myapplication.net.HttpUtils;
import com.example.lenovo.myapplication.net.RxUtils;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

public class ReimengM extends BaseModel{

    public void Reidian(final BaseCallBack<Bean> beanBaseCallBack){
        MyServer data = HttpUtils.getInstance().getData(MyServer.Urll, MyServer.class);

        Observable<Bean> data1 = data.getData();
        data1.compose(RxUtils.<Bean>rxObserableSchedulerHelper())
                .subscribe(new BaseObserver<Bean>() {

                    @Override
                    public void onSubscribe(Disposable d) {
                        compositeDisposable.add(d);
                    }

                    @Override
                    public void onNext(Bean bean) {

                        if (bean != null){
                            if (bean.getData() != null){
                                beanBaseCallBack.onSuccess(bean);
                            }else {
                                beanBaseCallBack.onFail("失败");
                            }
                        }else {
                            beanBaseCallBack.onFail("错误");
                        }

                    }
                });
    }

}
