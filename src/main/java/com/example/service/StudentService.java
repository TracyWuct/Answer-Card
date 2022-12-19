package com.example.service;

import com.example.entity.Student;

public interface StudentService {

    /**
     * 根据学生标识获取学生详情
     *
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
