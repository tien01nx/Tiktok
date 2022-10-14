package model;

import java.util.Scanner;

public class SongModel {
    //    private String id,name,singer;
    public Song inputSong() {
        Scanner sc = new Scanner(System.in);
        Song song = new Song();
        System.out.println("___________song___________");
        System.out.println("id: ");
        String id = sc.nextLine();
        song.setId(id);
        System.out.println("name: ");
        String name = sc.nextLine();
        song.setName(name);
        System.out.println("singer: ");
        String singer = sc.nextLine();
        song.setSinger(singer);
        return song;
    }

    public Song createSong() {
        SongModel songModel = new SongModel();
        Song song = songModel.inputSong();
        System.out.println(song.toString());
        return song;
    }
}
