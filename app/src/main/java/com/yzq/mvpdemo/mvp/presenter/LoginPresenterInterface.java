package com.yzq.mvpdemo.mvp.presenter;

/**
 * Created by yzq on 2018/1/11.
 * 登录presenter接口
 */

public interface LoginPresenterInterface {

    void login(String userName,String pwd);

    void loginResult(boolean result);
}
