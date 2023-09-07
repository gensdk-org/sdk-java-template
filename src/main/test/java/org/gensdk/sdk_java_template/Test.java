package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.rest.RESTClient;


public class Test {
    public static void main(String[] args) throws Exception {
        RESTClient restClient = RESTClient.builder().
                addr("127.0.0.1").
                port("8081").
                build();

        ClientSet clientSet = new ClientSet(restClient);

        // 调用 coreV1 服务的 credential 模块的 create 接口
        clientSet.coreV1().credential().create(Credential.builder().name("gocloudcoder2").type("colocation").build());

        Credential credential = new Credential();
        clientSet.directClient()
                .setVerb("GET")
                .buildSubPath("/api/v1.0/credential/1")
                .call()
                .into(credential);
        System.out.println(credential);
    }
}
