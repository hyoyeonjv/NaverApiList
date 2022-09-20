package com.example.restaurant.wishlist.service.userinfo;

import com.example.restaurant.naver.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("infoService")
public class InfoServiceImpl implements InfoService{
    @Autowired
    private InfoMapper infoMapper;


    @Override
    public List<User> userList() {
       List<User> list = infoMapper.userList();
        return list;
    }
}
