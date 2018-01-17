package com.yzq.mvpdemo.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.yzq.mvpdemo.R;
import com.yzq.mvpdemo.mvp.presenter.LoginPresenter;
import com.yzq.mvpdemo.mvp.view.LoginView;

/*
*
* 以登录为例
* LoginActivity持有LoginPresenter的引用，并实现了LoginView接口
*
* */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginView {
    private Button mLoginBtn;
    /*登录presenter*/
    private LoginPresenter presenter;
    private EditText mUserNameEt;
    private EditText mPwdEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        presenter = new LoginPresenter(this);
    }

    private void initView() {
        mLoginBtn = (Button) findViewById(R.id.loginBtn);
        mLoginBtn.setOnClickListener(this);
        mUserNameEt = (EditText) findViewById(R.id.userNameEt);
        mPwdEt = (EditText) findViewById(R.id.pwdEt);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.loginBtn:
                String userName = mUserNameEt.getText().toString();
                String pwd = mPwdEt.getText().toString();
                presenter.login(userName, pwd);
                break;
        }
    }

    @Override
    public void onSuccess() {
        Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailed() {
        Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}
