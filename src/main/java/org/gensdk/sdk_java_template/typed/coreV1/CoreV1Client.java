package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.rest.RESTClient;

public class CoreV1Client {
    private final RESTClient restClient;

    public CoreV1Client(RESTClient restClient) {
        this.restClient = restClient;
    }

    public static CoreV1Client NewForConfig(RESTClient restClient) {
        return new CoreV1Client(restClient);
    }

    public CredentialClient credential() {
        return new CredentialClient(this.restClient);
    }

    public MachineClient machine() {
        return new MachineClient(this.restClient);
    }
}
