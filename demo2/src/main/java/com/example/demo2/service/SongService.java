package com.example.demo2.service;

import com.example.demo2.model.Song;
import com.example.demo2.model.Type;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongService implements ISongService{
    private static Map<Long, Song> songList;

    private static Map<Long, Type> typeList;

    static {
        typeList = new HashMap<>();
        typeList.put(1L,new Type(1L,"Kpop"));
        typeList.put(2L,new Type(2L,"Vpop"));
        typeList.put(3L,new Type(3L,"Cpop"));

        songList = new HashMap<>();
        songList.put(1L,new Song(1L,"Phuc Du",typeList.get(1L),"https://www.nhaccuatui.com/bai-hat/die-of-a-broken-heart-olly-murs.VAB5tlLssTjz.html"));
        songList.put(2L,new Song(2L,"MONO",typeList.get(2L),"https://www.nhaccuatui.com/bai-hat/die-of-a-broken-heart-olly-murs.VAB5tlLssTjz.html"));
        songList.put(3L,new Song(3L,"Phuc Du",typeList.get(3L),"https://www.nhaccuatui.com/bai-hat/die-of-a-broken-heart-olly-murs.VAB5tlLssTjz.html"));
    }

    @Override
    public List<Song> findAll() {
        return new ArrayList<>(songList.values());
    }

    @Override
    public List<Type> findAllType() {
        return new ArrayList<>(typeList.values());
    }

    @Override
    public void save(Song song) {
        songList.put(song.getId(), song);

    }

    @Override
    public Song findById(long id) {
        return null;
    }

    @Override
    public void update(Long id, Song song) {
    }

    @Override
    public void remove(Long id) {
    }
}
