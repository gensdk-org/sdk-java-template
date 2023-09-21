package org.gensdk.sdk_java_template.models.coreV1;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class Machine {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
