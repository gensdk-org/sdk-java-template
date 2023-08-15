package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;
import org.gensdk.sdk_java_template.rest.RESTClient;

import java.util.ArrayList;

public class CredentialClient {
    private final RESTClient restClient;

    public CredentialClient(RESTClient restClient) {
        this.restClient = restClient;
    }

    public ArrayList<Credential> list(QueryParams queryParams) {
        System.out.println(this.getRestClient().getAddr());
        // 创建一个空的 ArrayList
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

    public RESTClient getRestClient() {
        return restClient;
    }
}
