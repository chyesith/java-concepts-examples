package org.yesh.learn.record;

public record StudentRecord(String name, int studentNumber ){


    public String name() {
        return name;
    }
}
