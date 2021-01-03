package com.catalogue.discographies.repositories;

import com.catalogue.discographies.models.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album, String> {
    List<Album> findByArtistId(Long artistId);
}
