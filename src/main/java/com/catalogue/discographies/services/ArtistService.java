package com.catalogue.discographies.services;

import com.catalogue.discographies.models.Artist;
import com.catalogue.discographies.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        return (List<Artist>) artistRepository.findAll();
    }

    public Artist getArtist(Long id) {
        List<Artist> artists = (List<Artist>) artistRepository.findAll();

        for (Artist artist : artists) {
            if(artist.getId().equals(id)) {
                return artist;
            }
        }

        return null;
    }

    public void addArtist(Artist artist) {
        artistRepository.save(artist);
    }

    public void updateArtist(Artist artist) {
        artistRepository.save(artist);
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}



























