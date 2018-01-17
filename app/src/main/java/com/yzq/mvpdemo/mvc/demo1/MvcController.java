package com.yzq.mvpdemo.mvc.demo1;

import android.os.Handler;
import android.text.TextUtils;
import android.widget.Toast;

import com.yzq.mvpdemo.LoginResultBean;

/**
 * Created by yzq on 2018/1/17.
 * 用来处理逻辑的控制层,这里还直接操作了view
 */

public class MvcController {

    private MvcActivity activity;

    public MvcController(MvcActivity activity) {
        this.activity = activity;
    }

    public void login() {
        /*拿到输入框的数据*/
        String userName = activity.mUserNameEt.getText().toString().trim();
        String pwd = activity.mPwdEt.getText().toString().trim();
        /*判空*/
        if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(pwd)) {
            Toast.makeText(activity, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
            return;
        }

        /*模拟登录*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*模拟登录操作*/

                LoginResultBean resultBean = new LoginResultBean();//这里我可以看做是Model层
                if (resultBean.getCode() == 0) {
                    /*登录成功*/
                    Toast.makeText(activity, "登录成功", Toast.LENGTH_SHORT).show();
                }
            }
        }, 3000);
    }
}
