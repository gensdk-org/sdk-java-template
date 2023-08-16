package org.gensdk.sdk_java_template.typed.coreV1;

import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

public class MachineClient {
    private final Request request;

    public MachineClient(RESTClient restClient) {
        this.request = new Request();
        this.request.setRestClient(restClient);
    }

    public Machine detail() throws Exception {
        Machine machine = new Machine();
        this.request.
                setVerb("GET").
                setSubPath("/hello/say").
                buildCall().
                into(machine);
        return machine;
    }
}
