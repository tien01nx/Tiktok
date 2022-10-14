package controller;

import model.*;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        IdolModel idolModel = new IdolModel();
        Tiktok tiktok = new Tiktok();

        ArrayList<Idol> idols = new ArrayList<>();
        Idol idol = idolModel.createIdol();
        idols.add(idol);
        tiktok.setIdols(idols);

        System.out.println(idol.toString());
//
        SongModel songModel = new SongModel();
        ArrayList<Song> songs = new ArrayList<>();
        System.out.println("so luong song");
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            Song song = songModel.createSong();
            songs.add(song);
            tiktok.setSongs(songs);
        }

        System.out.println("_____________Tiktok_____________");
        System.out.println(tiktok.toString());


    }
}
