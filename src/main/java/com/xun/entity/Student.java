package com.xun.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {
    private Integer id;
    private String username;
    private String password;
    private Integer isDelete;
}
