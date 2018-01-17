package com.yzq.mvpdemo.chaos;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yzq.mvpdemo.LoginResultBean;
import com.yzq.mvpdemo.R;

import static com.yzq.mvpdemo.R.layout.activity_chaos;

/*
*
* 最简单粗暴但也是耦合度最高的写法
* 想当初我刚入行的时候就是这么写的
*
* */
public class ChaosActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText mUserNameEt;//用户名
    private EditText mPwdEt;//密码
    private Button mLoginBtn;//登录按钮

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_chaos);
        initView();
    }

    private void initView() {
        mUserNameEt = findViewById(R.id.userNameEt);
        mPwdEt = findViewById(R.id.pwdEt);
        mLoginBtn = findViewById(R.id.loginBtn);
        mLoginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.loginBtn:
                String userName = mUserNameEt.getText().toString().trim();
                String pwd = mPwdEt.getText().toString().trim();
                if (TextUtils.isEmpty(userName) || TextUtils.isEmpty(pwd)) {
                    Toast.makeText(this, "用户名或密码不能为空", Toast.LENGTH_SHORT).show();
                    return;
                }
                login();
                break;
        }
    }

    /*登录操作*/
    private void login() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*模拟登录操作*/
                LoginResultBean resultBean = new LoginResultBean();
                if (resultBean.getCode() == 0) {
                    /*登录成功*/
                    Toast.makeText(ChaosActivity.this, resultBean.getMsg(), Toast.LENGTH_SHORT).show();
                }

            }
        }, 3000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


}
