package com.yzq.mvpdemo.mvp.view;

/**
 * Created by yzq on 2018/1/11.
 * 登录的view接口
 * 用来定义LoginActivity视图层的处理逻辑   比如显示弹窗  登录成功
 */

public interface LoginView {

    void onSuccess();

    void onFailed();

}
