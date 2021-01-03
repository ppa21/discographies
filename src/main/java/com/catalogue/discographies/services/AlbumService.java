package com.catalogue.discographies.services;

import com.catalogue.discographies.models.Album;
import com.catalogue.discographies.repositories.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums(Long artistId) {
        List<Album> albums = new ArrayList<>();

        albumRepository.findByArtistId(artistId).forEach(albums::add);

        return albums;
    }

    public Album getAlbum(String albumId) {
        List<Album> albums = (List<Album>) albumRepository.findAll();

        for(Album album : albums) {
            if(album.getId().equals(albumId)) {
                return album;
            }
        }

        return null;
    }

    public void addAlbum(Album album) {
        albumRepository.save(album);
    }

    public void updateAlbum(Album album) {
        albumRepository.save(album);
    }

    public void deleteAlbum(String albumId) {
        albumRepository.deleteById(albumId);
    }
}





















