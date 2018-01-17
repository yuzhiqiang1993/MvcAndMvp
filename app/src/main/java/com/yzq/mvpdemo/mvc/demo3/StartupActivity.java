package com.yzq.mvpdemo.mvc.demo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.yzq.mvpdemo.R;

/*
* 启动界面
* 用来测试复用登录逻辑代码
* */
public class StartupActivity extends AppCompatActivity implements LoginView  {

    private MvcController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        controller = new MvcController(this);

        /*这里一般是从本地拿到之前登录时存储的数据*/
        String userName = "";
        String pwd = "";
        /*自动登录*/
        controller.login(userName, pwd);

    }

    @Override
    public void onSuccess() {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }
}
