package com.example.restaurant.wishlist.service.userinfo;

import com.example.restaurant.naver.dto.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InfoMapper {

    List<User> userList();
}
