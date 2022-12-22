package com.example.entity;

public class Paper {
    private Integer pid;
    private String answer;
    private String paper_title;
    private Integer individual_score;

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setAns(String answer) {
        this.answer = answer;
    }

    public void setPaper_title(String paper_title) {
        this.paper_title = paper_title;
    }

    public void setIndividual_score(Integer individual_score) {
        this.individual_score = individual_score;
    }

    public Integer getPid() {
        return pid;
    }

    public String getAnswer() {
        return answer;
    }

    public String getPaper_title() {
        return paper_title;
    }

    public Integer getIndividual_score() {
        return individual_score;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "Pid=" + pid +
                ", Answer='" + answer + '\'' +
                ", title='" + paper_title + '\'' +
                ", score='" + individual_score + '\'' +
                '}';
    }
}
