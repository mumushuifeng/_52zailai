package com.xun.service.impl;

import com.xun.entity.Student;
import com.xun.entity.User;
import com.xun.mapper.IStudentMapper;
import com.xun.mapper.IUserMapper;
import com.xun.service.IStudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {
    /*@Resource
    private IStudentMapper studentMapper;*/
    @Resource
    private IUserMapper userMapper;
    @Override
    public Integer addStudent(Student student) {
      /*  Student stu = studentMapper.findById(2);
        System.out.println(stu);
        List<Student> all = studentMapper.findAll();
        System.out.println(all);
        return studentMapper.addStudent(student);*/
        User cardById = userMapper.findCardById(1);
        System.out.println(cardById);
        return null;
    }



}
