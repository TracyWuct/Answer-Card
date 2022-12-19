package com.example.mapper;

import com.example.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


public interface StudentMapper {

    @Select("select * from student where sid = #{sid}")
    Student selectByPrimaryKey(int sid);
}
