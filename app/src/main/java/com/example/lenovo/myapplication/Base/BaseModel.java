package com.example.lenovo.myapplication.Base;

import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseModel {
    protected CompositeDisposable compositeDisposable = new CompositeDisposable();

    public void clear(){
        compositeDisposable.clear();
    }
}
