package com.catalogue.discographies.controllers;

import com.catalogue.discographies.models.Album;
import com.catalogue.discographies.models.Song;
import com.catalogue.discographies.services.SongService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SongController {
    private final SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping("/artists/{artistId}/albums/{albumId}/songs")
    public List<Song> getAllSongs(@PathVariable String albumId) {
        return songService.getAllSongs(albumId);
    }

    @GetMapping("/artists/{artistId}/albums/{albumsId}/songs/{songId}")
    public Song getSong(@PathVariable String songId) {
        return songService.getSong(songId);
    }

    @PostMapping("/artists/{artistId}/albums/{albumId}/songs")
    public void addSong(@RequestBody Song song, @PathVariable String albumId) {
        song.setAlbum(new Album(albumId, "", null, null));
        songService.addSong(song);
    }

    @PostMapping("/artists/{artistId}/albums/{albumId}/songs/{songId}")
    public void updateSong(@RequestBody Song song, @PathVariable String albumId) {
        song.setAlbum(new Album(albumId, "", null, null));
        songService.updateSong(song);
    }

    @DeleteMapping("/artists/{artistId}/albums/{albumId}/songs/{songId}")
    public void deleteSong(@PathVariable String songId) {
        songService.deleteSong(songId);
    }
}


































