package org.gensdk.sdk_java_template.rest;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String message;
    private Object data;
}