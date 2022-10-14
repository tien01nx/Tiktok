package model;

import java.util.ArrayList;
import java.util.Scanner;

public class IdolModel {
//    private  String name,id,email;
//    private ArrayList<Follower> followers;
    public Idol inputIdol(){

        Idol idol = new Idol();
        Scanner sc = new Scanner(System.in);
        System.out.println("___________idol___________");
        System.out.println("id: ");
        String id = sc.nextLine();
        idol.setId(id);
        System.out.println("name: ");
        String name = sc.nextLine();
        idol.setName(name);
        System.out.println("email: ");
        String email = sc.nextLine();
        idol.setEmail(email);
        return idol;
    }

    public Idol createIdol(){
        Scanner sc = new Scanner(System.in);
        IdolModel idolModel = new IdolModel();
        FollowerModel followerModel = new FollowerModel();
        ArrayList<Follower> followers  =  new ArrayList<>();
        Idol idol = idolModel.inputIdol();
        System.out.println("Nhap so luong follower");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){

            Follower follower = followerModel.createFollower();
            System.out.println(follower.toString());
            followers.add(follower);
            idol.setFollowers(followers);
        }
        System.out.println("\n");
        System.out.println(idol.toString());
        return idol ;

    }


}
