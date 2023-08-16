package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;
import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

import java.util.ArrayList;

public class CredentialClient {
    private final Request request;

    public CredentialClient(RESTClient restClient) {
        this.request = new Request();
        this.request.setRestClient(restClient);
    }

    public ArrayList<Credential> list(QueryParams queryParams) {
        System.out.println(this.request.getRestClient().getAddr());
        System.out.println(queryParams.getStart());

        ArrayList<Credential> credentials = new ArrayList<>();

        Credential credential = new Credential();
        credential.setName("jaronnie");
        credential.setId(1);

        credentials.add(credential);
        return credentials;
    }

    public Credential detail() {
        return new Credential();
    }
}
