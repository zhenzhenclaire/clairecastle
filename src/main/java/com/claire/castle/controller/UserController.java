package com.claire.castle.controller;

import com.claire.castle.db.model.User;
import com.claire.castle.model.AuthedUser;
import com.claire.castle.service.UserService;
import com.claire.castle.utils.CookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "/user/login";
    }

//    @RequestMapping("/login")
//    public String userLogin(Model model, HttpServletRequest request, HttpServletResponse response) {
//        return "/user/login";
//    }

    @RequestMapping("/reg")
    public String userReg(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/user/reg";
    }

    @RequestMapping("/ureg")
    public String userUReg(Model model,
                           HttpServletRequest request, HttpServletResponse response,
                           @RequestParam(value = "username") String username,
                           @RequestParam(value = "passwd") String password,
                           @RequestParam(value="email") String email) {
        if (LOGGER.isDebugEnabled()){
            LOGGER.debug("reg info username {} passwd {} email {}",username,password,email);
        }
        User userInfo = userService.getUserByNameAndPwd(username, password);
        if (userInfo != null) {
            model.addAttribute("msg", "用户名已经存在");
            return "/user/reg";
        }
        userService.addUser(username, password,email);
        return "redirect:/user/";
    }


    @RequestMapping(value = "/login")
    public String userLogin(Model model,
                            HttpServletRequest request, HttpServletResponse response,
                            @RequestParam(value = "username") String username,
                            @RequestParam(value = "passwd") String password) {
        if (LOGGER.isDebugEnabled()){
            LOGGER.debug("login info username {} passwd {}",username,password);
        }
        User userInfo = userService.getUserByNameAndPwd(username, password);
        if (userInfo != null) {
            AuthedUser user = new AuthedUser();
            user.setId(userInfo.getId());
            user.setName(username);
            user.setLevel(user.getLevel());
            user.setTime(System.currentTimeMillis());
            CookieUtils.setLoginCookie(response, user);
            if (LOGGER.isDebugEnabled()){
                LOGGER.debug("login success user info username {} passwd {},user {}",username,password,user.toJson());
            }
            return "redirect:/";
        } else {
            model.addAttribute("msg", "用户名或者密码不对！");
        }
        return "/user/login";
    }

}
