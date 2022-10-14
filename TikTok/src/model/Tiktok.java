package model;

import java.util.ArrayList;

public class Tiktok
{
    private ArrayList<Idol> idols;

    public Tiktok(ArrayList<Idol> idols, ArrayList<Song> songs) {
        this.idols = idols;
        this.songs = songs;
    }

    private ArrayList<Song> songs;


    public Tiktok() {
    }

    public ArrayList<Idol> getIdols() {
        return idols;
    }

    public void setIdols(ArrayList<Idol> idols) {
        this.idols = idols;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok{\n" +
                "idols=" + idols +
                ", songs=\n" + songs +
                '}';
    }
}

