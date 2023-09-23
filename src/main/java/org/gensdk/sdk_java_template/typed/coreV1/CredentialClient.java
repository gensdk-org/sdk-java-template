package org.gensdk.sdk_java_template.typed.coreV1;

import com.google.gson.reflect.TypeToken;
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

    public Boolean create(Credential createCredential) throws Exception {
        return this.request.
                setVerb("POST").
                buildSubPath("/api/v1.0/credential/create").
                setBody(createCredential).
                call().
                into(new TypeToken<Boolean>() {}.getType());
    }

    public Credential detail(Integer id) throws Exception {
        ArrayList<Request.PathParam> pathParams = new ArrayList<>();
        pathParams.add(Request.PathParam.builder().name("id").value(id).build());

        return this.request.
                setVerb("GET").
                buildSubPath("/api/v1.0/credential/{id}", pathParams).
                setBody(null).
                call().
                into(new TypeToken<Credential>() {}.getType());
    }
}
