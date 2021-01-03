package com.catalogue.discographies.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Song {
    @Id
    private String id;

    private String name;

    @ManyToOne
    private Album album;

    public Song() {
    }

    public Song(String id, String name, String albumId) {
        this.id = id;
        this.name = name;
        this.album = new Album(albumId, "", null, null);
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}













