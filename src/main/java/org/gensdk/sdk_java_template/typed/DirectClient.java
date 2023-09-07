package org.gensdk.sdk_java_template.typed;

import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

public class DirectClient {
    private final RESTClient restClient;

    public DirectClient(RESTClient restClient) {
        this.restClient = restClient;
    }

    public Request restClient() {
        Request request =  new Request();
        request.setRestClient(this.restClient);
        return request;
    }

    public static DirectClient NewForConfig(RESTClient restClient) {
        return new DirectClient(restClient);
    }
}
