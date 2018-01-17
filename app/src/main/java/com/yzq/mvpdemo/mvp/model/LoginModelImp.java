package com.yzq.mvpdemo.mvp.model;

import android.os.Handler;

import com.yzq.mvpdemo.mvp.presenter.LoginPresenterInterface;

/**
 * Created by yzq on 2018/1/11.
 * 登录model实现类
 */

public class LoginModelImp implements LoginModelInterface {

    private LoginPresenterInterface callback;
    public LoginModelImp(LoginPresenterInterface login) {
        this.callback = login;
    }


    @Override
    public void requestLogin(String userName, String pwd) {
        /*模拟登录操作*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*presenter*/
                callback.loginResult(true);

            }
        }, 3000);

    }


}