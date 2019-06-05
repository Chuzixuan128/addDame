package com.example.lenovo.myapplication.Base;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePresenter<M extends BaseModel,V extends BaseView> {

    protected List<BaseModel> list = new ArrayList<>();

    protected M myModel;
    protected V myView;

    public void initModel(M myModel){
        this.myModel = myModel;
        list.add(myModel);
    }

    public void attachView(V myView){
        this.myView = myView;
    }

    public void destory() {
        if (myView!=null){
            myView = null;
        }

        if (list!=null&&list.size()>0){
            for (BaseModel baseModel:list) {
                baseModel.clear();
            }
        }

        if (myModel!=null){
            myModel = null;
        }
    }

}
