package com.nihed.mloukhiya.domain;


public class ModelInformation {

    private String id;
    private Type type;

    public ModelInformation() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    private static enum Type {
        LIST, MAP
    }
}
