package org.gensdk.sdk_java_template.rest;

public class Result {
    private int code;
    private String message;
    private Object data;

    public Result(int code, String message, String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result() {}

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(String  data) {
        this.data = data;
    }
}