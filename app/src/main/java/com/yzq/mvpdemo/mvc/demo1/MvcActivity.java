package com.yzq.mvpdemo.mvc.demo1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.yzq.mvpdemo.R;


/*
*
* 将Activity当做是View层
*
* */
public class MvcActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText mUserNameEt;
    public EditText mPwdEt;
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
                controller.login();
                break;
        }
    }

    public void onSuccess() {

    }
}
