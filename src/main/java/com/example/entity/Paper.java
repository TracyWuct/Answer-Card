package com.example.entity;

public class Paper {
    private Integer pid;
    private String ans;

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Integer getPid() {
        return pid;
    }

    public String getAns() {
        return ans;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "Pid=" + pid +
                ", Answer='" + ans + '\'' +
                '}';
    }
}
