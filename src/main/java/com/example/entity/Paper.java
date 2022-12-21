package com.example.entity;

public class Paper {
    private Integer pid;
    private String ans;
    private String papaer_title;
    private Integer individual_score;

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public void setPapaer_title(String papaer_title) {
        this.papaer_title = papaer_title;
    }

    public void setIndividual_score(Integer individual_score) {
        this.individual_score = individual_score;
    }

    public Integer getPid() {
        return pid;
    }

    public String getAns() {
        return ans;
    }

    public String getPapaer_title() {
        return papaer_title;
    }

    public Integer getIndividual_score() {
        return individual_score;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "Pid=" + pid +
                ", Answer='" + ans + '\'' +
                '}';
    }
}
