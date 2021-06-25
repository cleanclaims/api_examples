package com.cleanclaims.example;

public class Payload {
    private String key;
    private Project project;

    public Payload(String key) {
        this.key = key;
    }

    public Payload(String key, Project project) {
        this.key = key;
        this.project = project;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
