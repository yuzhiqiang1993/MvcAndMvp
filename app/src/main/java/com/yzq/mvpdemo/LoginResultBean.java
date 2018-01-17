package com.yzq.mvpdemo;

/**
 * Created by yzq on 2018/1/16.
 * 模拟的登录成功返回的数据
 * 这里在mvc中是model（数据模型）
 * 在mvp中可以只把他当做一个实体类
 */

public class LoginResultBean {

    private int code=0;
    private String msg="登录成功";

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
