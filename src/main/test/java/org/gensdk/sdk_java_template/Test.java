package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;
import org.gensdk.sdk_java_template.rest.RESTClient;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        RESTClient restClient = new RESTClient();
        restClient.setProtocol("http");
        restClient.setAddr("127.0.0.1");
        restClient.setPort("8080");


        // 调用 coreV1 服务的 credential 模块的 list 接口
        QueryParams queryParams = new QueryParams();
        queryParams.setStart(1);
        ArrayList<Credential> listCredential = new ClientSet(restClient).coreV1().credential().list(queryParams);
        for (Credential credential : listCredential) {
            System.out.println(credential.toString());
        }

        // 调用 coreV1 服务的 machine 模块的 list 接口
        ArrayList<Machine> listMachine = new ClientSet(restClient).coreV1().machine().list(new QueryParams());
        for (Machine machine : listMachine) {
            System.out.println(machine.toString());
        }
    }
}
