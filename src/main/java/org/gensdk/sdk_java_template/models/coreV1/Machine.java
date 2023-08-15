package org.gensdk.sdk_java_template.models.coreV1;

import com.google.gson.annotations.SerializedName;

public class Machine {
    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" + this.getName() + ":" + this.getId() + "}";
    }
}
