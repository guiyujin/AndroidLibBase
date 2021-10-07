package com.guiyujin.androidlibbase.model;


/**
 * @ProjectName: PureNote_MVP
 * @Package: com.guiyujin.purenote_mvp.model.main
 * @ClassName: MainModelImpl
 * @Description: java类作用描述
 * @Author: 归余烬
 * @CreateDate: 2021/9/7 14:24
 * @UpdateUser: 更新者：
 * @UpdateDate: 2021/9/7 14:24
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class ModelImpl implements ModelContract.Model{

    @Override
    public void doSomething(String msg, ModelContract.CallBack callBack) {
        if (msg == "mvp"){
            callBack.onSuccess(msg);
        }else {
            callBack.onFailed();
        }

    }
}
