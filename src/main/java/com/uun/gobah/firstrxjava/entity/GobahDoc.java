package com.uun.gobah.firstrxjava.entity;

public class GobahDoc {
    private String name;
    private String type;

    public static GobahDoc create(String name, String type){
        GobahDoc gobahDoc = new GobahDoc();
        gobahDoc.setName(name);
        gobahDoc.setType(type);
        return gobahDoc;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "GobahDoc{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
