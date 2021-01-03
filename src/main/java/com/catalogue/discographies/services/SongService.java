package com.catalogue.discographies.services;

import com.catalogue.discographies.models.Song;
import com.catalogue.discographies.repositories.SongRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService {
    private final SongRepository songRepository;

    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public List<Song> getAllSongs(String albumId) {
        List<Song> songs = new ArrayList<>();

        songRepository.findByAlbumId(albumId).forEach(songs::add);

        return songs;
    }

    public Song getSong(String songId) {
        List<Song> songs = (List<Song>) songRepository.findAll();

        for(Song song : songs) {
            if(song.getId().equals(songId)) {
                return song;
            }
        }

        return null;
    }

    public void addSong(Song song) {
        songRepository.save(song);
    }

    public void updateSong(Song song) {
        songRepository.save(song);
    }

    public void deleteSong(String songId) {
        songRepository.deleteById(songId);
    }
}

































