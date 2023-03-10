package com.example.demo2.model;

public class Type {
    private Long id;
    private String name;

    public Type(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
