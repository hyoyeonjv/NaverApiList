package com.example.restaurant.controller;

import com.example.restaurant.naver.dto.User;
import com.example.restaurant.wishlist.service.userinfo.InfoService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import setting.ResponseAPI;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    @Autowired
    private InfoService infoService;

    @GetMapping("")
    public String main(){
        return "index";
    }

    @ApiOperation(value = "리스트  LIST")
    @GetMapping("/list")
    public ResponseAPI farmList(){

//        User user = AuthUtil.getCurrentUser();

        List<User> list = infoService.userList();
        return new ResponseAPI(HttpStatus.OK.value(), "OK", list);
    }


}
