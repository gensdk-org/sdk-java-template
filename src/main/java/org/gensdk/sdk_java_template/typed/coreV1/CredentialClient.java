package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

public class CredentialClient {
    private final Request request;

    public CredentialClient(RESTClient restClient) {
        this.request = new Request();
        this.request.setRestClient(restClient);
    }

    public Credential detail(int id) throws Exception {
        Credential credential = new Credential();
        this.request.
                setVerb("GET").
                setSubPath("/api/v1.0/credential/1").
                call().
                into(credential);
        return credential;
    }
}
