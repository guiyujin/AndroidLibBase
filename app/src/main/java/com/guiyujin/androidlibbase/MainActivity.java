package com.guiyujin.androidlibbase;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guiyujin.android_lib_base.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private Button button;
    StringBuffer stringBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void initParams(Bundle params) {
        stringBuffer  = new StringBuffer();
    }


    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        button = find(R.id.button);


    }

    @Override
    public void initListener() {
        button.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }


    @Override
    public void doBusiness(Context mContext) {

    }


    @Override
    public void widgetClick(int id) {
        switch (id){
            case R.id.button:
                showToast(2233);
                startActivity(SecondActivity.class);
                break;
            default:
                break;
        }
    }
}