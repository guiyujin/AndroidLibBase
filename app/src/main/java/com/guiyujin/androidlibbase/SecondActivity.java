package com.guiyujin.androidlibbase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guiyujin.android_lib_base.base.BaseActivity;
import com.guiyujin.android_lib_base.base.mvp.BaseMVPActivity;
import com.guiyujin.androidlibbase.model.ModelContract;
import com.guiyujin.androidlibbase.model.ModelImpl;
import com.guiyujin.androidlibbase.model.Presenter;

public class SecondActivity extends BaseMVPActivity<Presenter, ModelImpl> implements ModelContract.View {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter.attach(this, model);
    }

    @Override
    protected Presenter initPresenter() {
        return new Presenter();
    }

    @Override
    protected ModelImpl initModel() {
        return new ModelImpl();
    }


    @Override
    protected void initParams(Bundle params) {

    }


    @Override
    protected int bindLayout() {
        return R.layout.activity_second;
    }

    @Override
    protected void initView() {
        button = find(R.id.button2);
    }

    @Override
    protected void initListener() {
        button.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void doBusiness(Context mContext) {

    }

    @Override
    protected void widgetClick(int id) {
        switch (id){
            case R.id.button2:
                presenter.doSomething("mvp");
                break;
            default:
                break;
        }

    }

    @Override
    public void onSuccess(Object response) {
        showToast(response + " Success");
    }

    @Override
    public void onFailed() {
        showToast("Failed");
    }

    @Override
    public void onLoading() {

    }

    @Override
    public void disLoading() {

    }
}