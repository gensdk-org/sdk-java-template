package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.typed.DirectClient;
import org.gensdk.sdk_java_template.typed.coreV1.CoreV1Client;

import java.util.HashMap;
import java.util.Objects;

public class ClientSet {
    private final DirectClient directClient;
    private final CoreV1Client coreV1Client;

    public ClientSet(RESTClient restClient) {
        if (restClient.getHttpClient() == null) {
            restClient.defaultHttpClient();
        }

        if(Objects.equals(restClient.getProtocol(), null)) {
            restClient.setProtocol("http");
        }
        if(Objects.equals(restClient.getPort(), null)) {
            restClient.setPort("80");
        }

        if (restClient.getHeaders() == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("version", "v0.0.1-SNAPSHOT");
            restClient.setHeaders(hashMap);
        }
        this.coreV1Client = CoreV1Client.NewForConfig(restClient);
        this.directClient = DirectClient.NewForConfig(restClient);
    }

    public CoreV1Client coreV1() {
        return coreV1Client;
    }
    public DirectClient directClient() {
        return directClient;
    }
}
