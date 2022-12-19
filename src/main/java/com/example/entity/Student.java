package com.example.entity;

public class Student {
    private Integer sid;
    private String Name;
    private Integer score;

    public Integer getId() {
        return sid;
    }

    public void setId(Integer id) {
        this.sid = id;
    }

    public Integer getScore() {
        return score;
    }

    public String getUserName() {
        return Name;
    }

    public void setUserName(String Name) {
        this.Name = Name;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + sid +
                ", userName='" + Name + '\'' +
                ",score=" + score +
                '}';
    }
}