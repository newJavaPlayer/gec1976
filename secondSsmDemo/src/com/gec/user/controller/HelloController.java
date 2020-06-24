package com.gec.user.controller;

import com.gec.user.pojo.User;
import com.gec.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloController {
    @Autowired
    public UserService userService;
    @RequestMapping("/queryuserlist")
    @ResponseBody
    public List<User> queryuserList(){
        return userService.queryuserList();
    }

}
