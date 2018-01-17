package com.yzq.mvpdemo.mvc.demo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yzq.mvpdemo.R;



/*
*
* 将Activity当做是View层
*
* */
public class MvcActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mUserNameEt;
    private EditText mPwdEt;
    private Button mLoginBtn;
    private MvcController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        initView();
    }
    private void initView() {
        mUserNameEt = (EditText) findViewById(R.id.userNameEt);
        mPwdEt = (EditText) findViewById(R.id.pwdEt);
        mLoginBtn = (Button) findViewById(R.id.loginBtn);
        mLoginBtn.setOnClickListener(this);

        /*新建一个类作为controller*/
        controller = new MvcController(this);
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

                controller.login(userName,pwd);
                break;
        }
    }


    /*成功的回调*/
    public void onSuccess() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_SHORT).show();
    }


}
