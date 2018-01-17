package com.yzq.mvpdemo.mvc.demo2;

import android.os.Handler;

import com.yzq.mvpdemo.LoginResultBean;
import com.yzq.mvpdemo.mvc.demo1.*;

/**
 * Created by yzq on 2018/1/17.
 * 用来处理逻辑的控制层
 */

public class MvcController {

    private MvcActivity activity;

    public MvcController(MvcActivity activity) {
        this.activity = activity;
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
                    activity.onSuccess();
                }
            }
        }, 3000);

    }
}
