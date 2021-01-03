package com.catalogue.discographies.controllers;

import com.catalogue.discographies.models.Album;
import com.catalogue.discographies.models.Artist;
import com.catalogue.discographies.services.AlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlbumController {
    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/artists/{artistId}/albums")
    public List<Album> getAllAlbums(@PathVariable Long artistId) {
        return albumService.getAllAlbums(artistId);
    }

    @GetMapping("/artists/{artistId}/albums/{albumId}")
    public Album getAlbum(@PathVariable String albumId) {
        return albumService.getAlbum(albumId);
    }

    @PostMapping("/artists/{artistId}/albums")
    public void addAlbum(@RequestBody Album album, @PathVariable Long artistId) {
        album.setArtist(new Artist(artistId, "", ""));
        albumService.addAlbum(album);
    }

    @PostMapping("/artists/{artistId}/albums/{albumId}")
    public void updateAlbum(@RequestBody Album album, @PathVariable Long artistId) {
        album.setArtist(new Artist(artistId, "", ""));
        albumService.updateAlbum(album);
    }

    @DeleteMapping("/artists/{artistId}/albums/{albumId}")
    public void deleteAlbum(@PathVariable String albumId) {
        albumService.deleteAlbum(albumId);
    }
}

















