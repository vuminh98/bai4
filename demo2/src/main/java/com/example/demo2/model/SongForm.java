package com.example.demo2.model;

import org.springframework.web.multipart.MultipartFile;

public class SongForm {
    private long id;
    private String name;
    private String description;

    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public SongForm(long id, String name, String description, Type type, MultipartFile url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.url = url;
    }

    private MultipartFile url;


    public SongForm(long id, String name, String description, MultipartFile url) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MultipartFile getUrl() {
        return url;
    }

    public void setUrl(MultipartFile url) {
        this.url = url;
    }
}
