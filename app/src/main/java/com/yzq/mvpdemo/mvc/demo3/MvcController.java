package com.yzq.mvpdemo.mvc.demo3;

import android.os.Handler;

import com.yzq.mvpdemo.LoginResultBean;

/**
 * Created by yzq on 2018/1/17.
 * 用来处理逻辑的控制层
 */

public class  MvcController {
    private LoginView view;
    public MvcController(LoginView view) {
        this.view = view;
    }
    public void login(String userName, String pwd) {
           /*模拟登录*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*模拟登录操作*/

                LoginResultBean resultBean = new LoginResultBean();//这里我可以看做是Model层

                if (resultBean.getCode() == 0) {
                    /*登录成功*/
                    view.onSuccess();
                }
            }
        }, 3000);

    }
}
