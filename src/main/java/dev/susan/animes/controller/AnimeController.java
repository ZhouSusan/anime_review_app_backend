package dev.susan.animes.controller;

import dev.susan.animes.entity.Anime;
import dev.susan.animes.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/animes")
public class AnimeController {
    @Autowired
    private AnimeService animeService;
    @GetMapping
    public ResponseEntity<List<Anime>> getAllAnimes() {
        return new ResponseEntity<List<Anime>>(animeService.allAnimes(), HttpStatus.OK);
    }
}
