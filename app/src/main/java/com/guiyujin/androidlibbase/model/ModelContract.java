package com.guiyujin.androidlibbase.model;


import com.guiyujin.android_lib_base.base.ICallBack;
import com.guiyujin.android_lib_base.base.mvp.BaseModel;
import com.guiyujin.android_lib_base.base.mvp.BaseView;

/**
 * @ProjectName: PureNote_MVP
 * @Package: com.guiyujin.purenote_mvp.model.main
 * @ClassName: MainModelConstract
 * @Description: java类作用描述
 * @Author: 归余烬
 * @CreateDate: 2021/9/7 14:23
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/9/7 14:23
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public interface ModelContract {
    interface CallBack<T> extends ICallBack {
        void onSuccess(T response);
        void onFailed();
    }

    interface Model extends BaseModel {
        void doSomething(String msg, CallBack callBack);
    }

    interface View<T> extends BaseView {
        void onSuccess(T response);
        void onFailed();
    }

    interface presenter{
        void doSomething(String msg);
    }
}
