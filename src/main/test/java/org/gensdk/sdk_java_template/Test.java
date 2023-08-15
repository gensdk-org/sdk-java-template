package org.gensdk.sdk_java_template;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // new ClientSet
        ClientSet clientSet = new ClientSet();
        // 调用 coreV1 服务的 credential 模块的 list 接口
        ArrayList<Credential> list = clientSet.coreV1().credential().list(new QueryParams());
        for (Credential credential : list) {
            System.out.println(credential.toString());
        }

        // 调用 coreV1 服务的 machine 模块的 list 接口
        clientSet.coreV1().machine().list();
    }
}
