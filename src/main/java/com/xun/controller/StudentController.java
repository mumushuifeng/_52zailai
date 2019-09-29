package com.xun.controller;

import com.xun.entity.Student;
import com.xun.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {
    @Resource
    private IStudentService studentService;

    @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(){
        Student student = new Student();
        student.setUsername("yueyue");
        student.setPassword("123");
        Integer integer = studentService.addStudent(student);
        log.info("影响行数:"+integer);
        System.out.println("id:"+student.getId());
        return "添加成功";
    }
}
