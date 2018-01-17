package com.yzq.mvpdemo.mvp.model;

/**
 * Created by yzq on 2018/1/16.
 * 登录Model接口
 * 这里可以定义loginModel需要有哪些功能
 * 一般来说肯定会有个登录
 *
 */

public interface LoginModelInterface {

    /*请求登录*/
    void requestLogin(String userName,String pwd);
}
