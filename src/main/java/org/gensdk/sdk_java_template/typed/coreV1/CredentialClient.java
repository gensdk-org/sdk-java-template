package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;
import org.gensdk.sdk_java_template.rest.Request;

import java.util.ArrayList;

public class CredentialClient {
    // request
    Request request;

    public ArrayList<Credential> list(QueryParams queryParams) {
        System.out.println(this.request.getVerb());

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
}
