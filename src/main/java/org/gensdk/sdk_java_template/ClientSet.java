package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.typed.coreV1.CoreV1Client;

public class ClientSet {
    private final CoreV1Client coreV1Client;

    public ClientSet(RESTClient restClient) {
        this.coreV1Client = CoreV1Client.NewForConfig(restClient);
    }

    public CoreV1Client coreV1() {
        return coreV1Client;
    }
}
