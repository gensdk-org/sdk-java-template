package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.typed.coreV1.CoreV1Client;

import java.util.HashMap;

public class ClientSet {
    private final CoreV1Client coreV1Client;

    public ClientSet(RESTClient restClient) {
        if (restClient.getHttpClient() == null) {
            restClient.defaultHttpClient();
        }

        if (restClient.getHeaders() == null) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("Content-Type", "application/json");
            hashMap.put("version", "v0.0.1-SNAPSHOT");
            restClient.setHeaders(hashMap);
        }
        this.coreV1Client = CoreV1Client.NewForConfig(restClient);
    }

    public CoreV1Client coreV1() {
        return coreV1Client;
    }
}
