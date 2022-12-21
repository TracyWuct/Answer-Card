package com.example.service.impl;

import com.example.entity.Paper;
import com.example.entity.Student;
import com.example.mapper.PaperMapper;
import com.example.mapper.StudentMapper;
import com.example.service.PaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Override
    public void Create_new_paper(int pid, String ans, String paper_title, int individual_score) {
        paperMapper.Create_new_paper(pid, ans, paper_title, individual_score);
        paperMapper.Create_paper_table("paper_" + String.valueOf(pid));
    }

    @Override
    public String Get_paper(int pid) {
        return paperMapper.Get_paper(pid);
    }

    @Override
    public void Set_score(String table_name, int sid, String name, int score) {
        paperMapper.Set_score(table_name, sid, name, score);
    }

}
