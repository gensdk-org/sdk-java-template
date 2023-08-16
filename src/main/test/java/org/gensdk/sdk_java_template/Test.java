package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.rest.RESTClient;

public class Test {
    public static void main(String[] args) throws Exception {
        RESTClient restClient = new RESTClient().
                setProtocol("http").
                setAddr("127.0.0.1").
                setPort("8080");

        ClientSet clientSet = new ClientSet(restClient);

        Credential.CreateCredentialReq createCredentialReq =  new Credential.CreateCredentialReq();
        createCredentialReq.setName("jaronnie2");
        clientSet.coreV1().credential().create(createCredentialReq);

        // 调用 coreV1 服务的 credential 模块的 detail 接口
        Credential credentialDetail = clientSet.coreV1().credential().detail(1);
        System.out.println(credentialDetail.getName());

        // 调用 coreV1 服务的 machine 模块的 detail 接口
        Machine machineDetail = clientSet.coreV1().machine().detail();
        System.out.println(machineDetail.getName());
    }
}
