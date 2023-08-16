package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.rest.RESTClient;

public class Test {
    public static void main(String[] args) throws Exception {
        RESTClient restClient = new RESTClient();
        restClient.setProtocol("http");
        restClient.setAddr("127.0.0.1");
        restClient.setPort("8080");
        restClient.defaultHttpClient();


        // 调用 coreV1 服务的 credential 模块的 detail 接口
        Credential credentialDetail = new ClientSet(restClient).coreV1().credential().detail();
        System.out.println(credentialDetail);

        // 调用 coreV1 服务的 machine 模块的 detail 接口
        Machine machineDetail = new ClientSet(restClient).coreV1().machine().detail();
        System.out.println(machineDetail);
    }
}
