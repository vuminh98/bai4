package com.example.demo2.controller;

import com.example.demo2.model.Song;
import com.example.demo2.model.Type;
import com.example.demo2.service.ISongService;
import com.example.demo2.service.SongService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/song")
public class SongController {
    private final ISongService productService = new SongService();

    @GetMapping("")
    public String index(Model model) {
        List<Song> songList = productService.findAll();
        List<Type> typeList = productService.findAllType();
        model.addAttribute("songs", songList);
        model.addAttribute("types", typeList);
        return "/index";
    }

}
