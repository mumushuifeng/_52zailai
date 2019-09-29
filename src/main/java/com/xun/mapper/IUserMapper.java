package com.xun.mapper;

import com.xun.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserMapper {
    User findCardById(@Param("uId")int uid);
}
