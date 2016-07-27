package com.nihed.mloukhiya.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class ModelInformation {

    private String id;
    private ModelType type;
    @JsonIgnore
    private Object content;

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
    public Object getContent() {
        return content;
    }

    @JsonIgnore
    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelInformation that = (ModelInformation) o;

        if (!id.equals(that.id)) return false;
        return type == that.type;

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ModelInformation{" +
                "id='" + id + '\'' +
                ", type=" + type +
                '}';
    }

}
