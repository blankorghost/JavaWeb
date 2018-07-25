package com.lp.girl.entity;

import static javafx.scene.input.KeyCode.T;
/**
 * http请求返回的最外层对象
 */
public class Result<T> {

    /** 错误码 */
    private int code;
    /** 提示信息*/
    private String msg;
    /** 具体内容*/
    private T data;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}