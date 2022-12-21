package com.example.service;

import com.example.entity.Paper;

public interface PaperService {
    void Create_new_paper(int pid, String ans, String paper_title, int individual_score);

    String Get_paper(int pid);

    void Set_score(String table_name, int sid, String name, int score);

}
