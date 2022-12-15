package com.example.demo2.service;

import com.example.demo2.model.Song;
import com.example.demo2.model.Type;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    List<Type> findAllType();

    void save(Song song);

    Song findById(long id);

    void update(Long id, Song song);

    void remove(Long id);
}
