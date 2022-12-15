package com.example.demo2.model;

public class Song {
    private Long id;
    private String artist;
    private Type type;
    private String url;

    public Song(Long id, String artist, Type type, String url) {
        this.id = id;
        this.artist = artist;
        this.type = type;
        this.url = url;
    }

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
