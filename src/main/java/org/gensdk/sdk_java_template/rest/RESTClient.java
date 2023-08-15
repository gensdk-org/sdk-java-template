package org.gensdk.sdk_java_template.rest;

import okhttp3.OkHttpClient;

import java.util.Map;

public class RESTClient {
    private String protocol;
    private String addr;
    private String port;
    private Map<String, String> headers;
    private OkHttpClient httpClient;
}