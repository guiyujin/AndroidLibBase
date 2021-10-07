package com.guiyujin.androidlibbase.model;

import com.guiyujin.android_lib_base.base.mvp.BasePresenter;

import java.util.Map;

/**
 * @ProjectName: PureNote_MVP
 * @Package: com.guiyujin.purenote_mvp.model.main
 * @ClassName: MainPresenter
 * @Description: java类作用描述
 * @Author: 归余烬
 * @CreateDate: 2021/9/7 14:24
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/9/7 14:24
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class Presenter extends BasePresenter<ModelContract.View, ModelContract.Model> implements ModelContract.presenter{

    @Override
    public void doSomething(String msg) {
        mView.onLoading();
        mModel.doSomething(msg, new ModelContract.CallBack() {
            @Override
            public void onSuccess(Object response) {
                mView.disLoading();
                mView.onSuccess(response);
            }

            @Override
            public void onFailed() {
                mView.disLoading();
                mView.onFailed();
            }
        });
    }
}
