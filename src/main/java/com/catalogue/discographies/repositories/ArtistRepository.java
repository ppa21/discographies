package com.catalogue.discographies.repositories;

import com.catalogue.discographies.models.Artist;
import org.springframework.data.repository.CrudRepository;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
