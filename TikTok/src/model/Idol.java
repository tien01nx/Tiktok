package model;

import java.util.ArrayList;

public class Idol {
//    name, id, email, followers(Những người theo dõi),
//(String) group
    private  String name,id,email;
    private ArrayList<Follower> followers;

    public Idol() {
    }

    public Idol(String name, String id, String email, ArrayList<Follower> followers) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.followers = followers;
    }


    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                "\n  followers=" + followers +
                '}' +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }
}
