package com.catalogue.discographies.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Album {
    @Id
    private String id;

    private String name;
    private Long albumNumber;

    @ManyToOne
    private Artist artist;

    public Album() {
    }

    public Album(String id, String name, Long albumNumber, Long artistId) {
        this.id = id;
        this.name = name;
        this.albumNumber = albumNumber;
        this.artist = new Artist(artistId, "", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAlbumNumber() {
        return albumNumber;
    }

    public void setAlbumNumber(Long albumNumber) {
        this.albumNumber = albumNumber;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }
}
