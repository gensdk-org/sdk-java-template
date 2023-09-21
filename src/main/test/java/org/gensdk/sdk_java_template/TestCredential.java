package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.rest.RESTClient;


public class TestCredential {
    public static void main(String[] args) throws Exception {
        RESTClient restClient = RESTClient.builder().
                addr("127.0.0.1").
                port("8081").
                build();

        ClientSet clientSet = new ClientSet(restClient);

        Credential credential = clientSet.coreV1().credential().detail(1);
        System.out.println(credential);
    }
}
