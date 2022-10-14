package model;

public class Follower {
    private  String name,id,email;
    private int  numberOfLike;

    public Follower() {
    }

    public Follower(String name, String id, String email, int numberOfLike) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "\nFollower{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", numberOfLike=" + numberOfLike +
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

    public int getNumberOfLike() {
        return numberOfLike;
    }

    public void setNumberOfLike(int numberOfLike) {
        this.numberOfLike = numberOfLike;
    }
}
