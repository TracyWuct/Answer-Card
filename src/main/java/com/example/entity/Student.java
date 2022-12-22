package com.example.entity;

public class Student {
    private String Name;
    private Integer score;


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
                ", userName='" + Name + '\'' +
                ",score=" + score +
                '}';
    }
}