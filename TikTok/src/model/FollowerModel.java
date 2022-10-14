package model;

import java.util.Scanner;

public class FollowerModel {
    public  Follower createFollower (){

        Follower follower = new Follower();
        Scanner sc = new Scanner(System.in);
        System.out.println("name: ");
        String name = sc.nextLine();
        follower.setName(name);
        System.out.println("id: ");
        String id = sc.nextLine();
        follower.setId(id);
        System.out.println("email: ");
        String email = sc.nextLine();
        follower.setEmail(email);
        System.out.println("numberOfLike: ");
        int numberOfLike = sc.nextInt();
        follower.setNumberOfLike(numberOfLike);
        return  follower;
    }
}
