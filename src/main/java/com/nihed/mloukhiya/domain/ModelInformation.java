package com.nihed.mloukhiya.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class ModelInformation {

    private String id;
    private ModelType type;
    @JsonIgnore
    private Object payload;

    public ModelInformation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelType getType() {
        return type;
    }

    public void setType(ModelType type) {
        this.type = type;
    }

    @JsonIgnore
    public Object getPayload() {
        return payload;
    }

    @JsonIgnore
    public void setPayload(Object payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelInformation that = (ModelInformation) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (type != that.type) return false;
        return payload != null ? payload.equals(that.payload) : that.payload == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (payload != null ? payload.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ModelInformation{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", payload=" + payload +
                '}';
    }
}
