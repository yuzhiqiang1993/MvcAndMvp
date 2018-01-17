package com.yzq.mvpdemo.mvp.presenter;

import com.yzq.mvpdemo.mvp.model.LoginModelImp;
import com.yzq.mvpdemo.mvp.view.LoginView;

/**
 * Created by yzq on 2018/1/11.
 * 登录presenter实现类
 */

public class LoginPresenter implements LoginPresenterInterface {

    LoginView loginView;
    LoginModelImp model;

    public LoginPresenter(LoginView view) {
        this.loginView = view;
        model = new LoginModelImp(this);
    }


    @Override
    public void login(String userName, String pwd) {
        /*调用model的请求登录*/
        model.requestLogin(userName, pwd);
    }


    /*登录结果回调*/
    @Override
    public void loginResult(boolean result) {
        if (result) {
            loginView.onSuccess();
        } else {
            loginView.onFailed();
        }
    }
}
