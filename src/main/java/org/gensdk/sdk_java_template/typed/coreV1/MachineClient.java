package org.gensdk.sdk_java_template.typed.coreV1;

import com.google.gson.reflect.TypeToken;
import org.gensdk.sdk_java_template.models.coreV1.Machine;
import org.gensdk.sdk_java_template.rest.RESTClient;
import org.gensdk.sdk_java_template.rest.Request;

import java.util.ArrayList;

public class MachineClient {
    private final Request request;

    public MachineClient(RESTClient restClient) {
        this.request = new Request();
        this.request.setRestClient(restClient);
    }

    public Machine detail(Integer id) throws Exception {
        ArrayList<Request.PathParam> pathParams = new ArrayList<>();
        pathParams.add(Request.PathParam.builder().name("id").value(id).build());
        return this.request.
                setVerb("GET").
                buildSubPath("/api/v1.0/machine/{id}", pathParams).
                call().
                into(new TypeToken<Machine>() {}.getType());
    }
}
