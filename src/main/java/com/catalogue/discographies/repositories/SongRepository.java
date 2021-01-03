package com.catalogue.discographies.repositories;

import com.catalogue.discographies.models.Song;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepository extends CrudRepository<Song, String> {
    List<Song> findByAlbumId(String albumId);
}
