package com.fd.rookie.controller;

import com.fd.rookie.entity.User;
import com.fd.rookie.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("page/autologin")
public class LoginController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public ModelAndView toIndex(HttpServletRequest request){
        ModelAndView model = new ModelAndView("/autologin/showUser");
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addObject("user", user);
        return model;
    }

    @RequestMapping("/showUserList")
    public ModelAndView userList(HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView model = new ModelAndView("/autologin/showUserList");
        List<User> userList = this.userService.getUserList();
        response.setHeader("Host111","111");
        model.addObject("userList", userList);
        return model;
    }

    @RequestMapping(value="/fetch" , method= RequestMethod.GET)
    public String fetchResult(Date fromDate) {
        //Content goes here
        System.out.println(fromDate);
        return null;
    }
}
