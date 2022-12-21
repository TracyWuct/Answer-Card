package com.example.mapper;

import com.example.entity.Paper;
import com.example.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface PaperMapper {
    void Create_new_paper(int pid, String ans, String paper_title, int individual_score);

    void Create_paper_table(@Param("pname") String pname);

    String Get_paper(int pid);

    void Set_score(@Param("table_name") String table_name,
                   @Param("sid") int sid,
                   @Param("name") String name,
                   @Param("score") int score);
}
