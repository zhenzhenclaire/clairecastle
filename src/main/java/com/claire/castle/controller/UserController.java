package com.claire.castle.controller;

import com.claire.castle.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/login")
    public String userLogin(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/user/login";
    }

    @RequestMapping("/reg")
    public String userReg(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/user/reg";
    }

    @RequestMapping("/ureg")
    public String userUReg(Model model, HttpServletRequest request, HttpServletResponse response) {
        return "/user/reg";
    }


//    @RequestMapping(value = "/login")
//    public String userLogin(Model model,
//                            HttpServletRequest request, HttpServletResponse response,
//                            @RequestParam(value = "username") String username,
//                            @RequestParam(value = "passwd") String password) {
////        AuthedUser user = CookieUtils.getLoginUser(request);
////        if (user != null) {
////            return "redirect:/";
////        }
////        User userInfo = userService.getUserByNameAndPwd(username, password);
////        if (userInfo != null) {
////            user = new AuthedUser();
////            user.setId(userInfo.getId());
////            user.setName(username);
////            user.setLevel(userInfo.getLevel());
////            user.setTime(System.currentTimeMillis());
////            CookieUtils.setLoginCookie(response, user);
////            return "redirect:/";
////        } else {
////            model.addAttribute("msg", "用户名或者密码不对！");
////        }
//        return "/user/login";
//    }

}
