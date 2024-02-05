package dev.susan.animes.service;

import dev.susan.animes.entity.Anime;
import dev.susan.animes.repository.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {

    @Autowired
    private AnimeRepository animeRepository;
    public List<Anime> allAnimes() {
        return animeRepository.findAll();
    }
}
