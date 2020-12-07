package com.crud.controller;

import com.bean.User;
import com.crud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public String findAll(HttpSession session){
        List<User> users=userService.findAll();
        session.setAttribute("users",users);
        return "show";
    }
}
