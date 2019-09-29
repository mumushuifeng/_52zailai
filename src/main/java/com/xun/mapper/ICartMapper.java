package com.xun.mapper;

import com.xun.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ICartMapper {
    List<Cart> findCartByUid(@Param("uId") int uid);
}
