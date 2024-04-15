package MODELS;

import ENUMS.Genere;

import java.util.ArrayList;
import java.util.List;

public class Song {
    private String name;
    private double duration;
    private Genere genere;
    private Album album;
    private Artist artist;


    public Song(String name, Genere genere, double duration, Album album, Artist artist) {
        this.name = name;
        this.genere = genere;
        this.duration = duration;
        this.album = album;
        this.artist = artist;
    }

    public Song() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", genere=" + genere +
                ", duration=" + duration +
                ", album=" + album +
                ", artist=" + artist +
                '}';
    }
}
