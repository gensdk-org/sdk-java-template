package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.rest.RESTClient;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Token", "your_token");
        RESTClient restClient = RESTClient.builder().
                addr("127.0.0.1").
                port("8081").
                headers(headers).build();

        ClientSet clientSet = new ClientSet(restClient);

        // 调用 coreV1 服务的 credential 模块的 create 接口
        clientSet.coreV1().credential().create(Credential.builder().name("jaronnie2").build());

        // 调用 coreV1 服务的 credential 模块的 detail 接口
        Credential credentialDetail = clientSet.coreV1().credential().detail(Credential.builder().id(1).build());
        System.out.println(credentialDetail.getName());

        // 调用 coreV1 服务的 machine 模块的 detail 接口
        Machine machineDetail = clientSet.coreV1().machine().detail();
        System.out.println(machineDetail.getName());
    }
}
