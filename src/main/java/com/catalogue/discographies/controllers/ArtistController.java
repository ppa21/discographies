package com.catalogue.discographies.controllers;

import com.catalogue.discographies.models.Artist;
import com.catalogue.discographies.services.ArtistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArtistController {
    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping("/artists")
    public List<Artist> getAllArtists() {
        return artistService.getAllArtists();
    }

    @GetMapping("/artists/{id}")
    public Artist getArtist(@PathVariable Long id) {
        return artistService.getArtist(id);
    }

    @PostMapping("/artists")
    public void addArtist(@RequestBody Artist artist) {
        artistService.addArtist(artist);
    }

    @PostMapping("/artists/{id}")
    public void updateArtist(@RequestBody Artist artist) {
        artistService.updateArtist(artist);
    }

    @DeleteMapping("/artists/{id}")
    public void deleteArtist(@PathVariable Long id) {
        artistService.deleteArtist(id);
    }
}






















