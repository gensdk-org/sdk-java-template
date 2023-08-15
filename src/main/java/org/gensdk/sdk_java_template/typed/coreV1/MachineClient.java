package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Credential;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.models.coreV1.QueryParams;
import org.gensdk.sdk_java_template.rest.RESTClient;

import java.util.ArrayList;

public class MachineClient {
    private final RESTClient restClient;

    public MachineClient(RESTClient restClient) {
        this.restClient = restClient;
    }

    public ArrayList<Machine> list(QueryParams queryParams) {
        System.out.println(this.getRestClient().getAddr());
        // 创建一个空的 ArrayList
        ArrayList<Machine> machines = new ArrayList<>();

        Machine machine = new Machine();
        machine.setName("jaronnie");
        machine.setId(1);

        machines.add(machine);
        return machines;
    }

    public Credential detail() {
        return new Credential();
    }

    public RESTClient getRestClient() {
        return restClient;
    }
}
