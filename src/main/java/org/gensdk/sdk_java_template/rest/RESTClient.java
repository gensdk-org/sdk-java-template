package org.gensdk.sdk_java_template.rest;

import okhttp3.OkHttpClient;

import java.util.Map;

public class RESTClient {
    private String protocol;
    private String addr;
    private String port;
    private Map<String, String> headers;
    private OkHttpClient httpClient;

    public String getProtocol() {
        return protocol;
    }

    public RESTClient setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public String getAddr() {
        return addr;
    }

    public RESTClient setAddr(String addr) {
        this.addr = addr;
        return this;
    }

    public String getPort() {
        return port;
    }

    public RESTClient setPort(String port) {
        this.port = port;
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public RESTClient setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    public void setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void defaultHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        this.setHttpClient(builder.build());
    }
}