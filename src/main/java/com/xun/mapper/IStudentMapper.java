package com.xun.mapper;

import com.xun.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentMapper {
    Integer addStudent(@Param("stu") Student student);
    Student findById(@Param("id1") Integer id);
    List<Student> findAll();
}
