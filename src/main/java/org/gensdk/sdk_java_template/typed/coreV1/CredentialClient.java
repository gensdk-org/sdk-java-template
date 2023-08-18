package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

import java.util.ArrayList;

public class CredentialClient {
    private final Request request;

    public CredentialClient(RESTClient restClient) {
        this.request = new Request();
        this.request.setRestClient(restClient);
    }

    public void create(Credential createCredential) throws Exception {
        this.request.
                setVerb("POST").
                buildSubPath("/api/v1.0/credential/create").
                setBody(createCredential).
                call().
                into(null);
    }

    public Credential detail(Credential credential) throws Exception {
        ArrayList<Request.PathParam> pathParams = new ArrayList<>();
        pathParams.add(Request.PathParam.builder().name("id").value(credential.getId()).build());

        this.request.
                setVerb("GET").
                buildSubPath("/api/v1.0/credential/{id}", pathParams).
                setBody(null).
                call().
                into(credential);
        return credential;
    }
}
