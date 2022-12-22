package com.example.service;

import com.example.entity.Paper;
import com.example.entity.Student;

public interface PaperService {
    void Create_new_paper(int pid, String ans, String paper_title, int individual_score);

    Paper Get_paper(int pid);

    void Set_score(String table_name, String name, int score);

    void Submit_card(String name, int score);

}
