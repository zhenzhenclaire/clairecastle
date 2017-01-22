package com.claire.castle.controller;

import com.claire.castle.model.AuthedUser;
import com.claire.castle.utils.CookieUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("")
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
        //获取用户的数据
        AuthedUser user = CookieUtils.getLoginUser(request);

        if (user != null) {
            if (LOGGER.isDebugEnabled()){
                LOGGER.debug("user {}",user.toJson());
            }
            model.addAttribute("user", user);
        }
        if (LOGGER.isDebugEnabled()){
            LOGGER.debug("user is null");
        }

        //获取
        return "/index";
    }

}
