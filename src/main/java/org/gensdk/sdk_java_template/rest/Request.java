package org.gensdk.sdk_java_template.rest;

import com.google.gson.Gson;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Request {
    private RESTClient restClient;
    private String verb;
    private String params;

    private String subPath;

    private Object body;

    public RESTClient getRestClient() {
        return this.restClient;
    }

    public void setRestClient(RESTClient restClient) {
        this.restClient = restClient;
    }

    public String getVerb() {
        return this.verb;
    }

    public Request setVerb(String verb) {
        this.verb = verb;
        return this;
    }

    public String getParams() {
        return this.params;
    }

    public Request setParams(String params) {
        this.params = params;
        return this;
    }

    public String getSubPath() {
        return this.subPath;
    }

    public Request setSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }

    public String defaultUrl() throws Exception {
       if("".equals(this.restClient.getProtocol()) || "".equals(this.restClient.getAddr()) || "".equals(this.restClient.getPort())) {
           throw new Exception("invalid url, please check your protocol and addr and port");
        }

        return this.restClient.getProtocol() +
                "://" +
                this.restClient.getAddr() +
                ":" +
                this.restClient.getPort() +
                this.getSubPath();
    }

    public okhttp3.Request buildRequest() throws Exception {
        okhttp3.Request.Builder reqBuilder = (new okhttp3.Request.Builder()).url(this.defaultUrl());
        reqBuilder.method(this.verb, (RequestBody) this.body);
        return reqBuilder.build();
    }

    public Request call() throws Exception {
        okhttp3.Request request = this.buildRequest();
        Response res =  this.restClient.getHttpClient().newCall(request).execute();
        assert res.body() != null;
        this.body = res.body().string();
        res.close();
        return this;
    }

    public void into(Object object) throws InvocationTargetException, IllegalAccessException {
        Gson gson = new Gson();
        Result result = gson.fromJson((String) this.body, Result.class);
        if(result.getCode() != 200) {
            System.out.println("code 非 200");
            return;
        }
        Object data = gson.fromJson(gson.toJson(result.getData()), object.getClass());
        if (object.getClass().isInstance(data)) {
            BeanUtils.copyProperties(object, data);
        } else {
            System.out.println("数据类型不匹配");
        }
    }
}
