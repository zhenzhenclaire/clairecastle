package com.claire.castle.service.impl;

import com.claire.castle.db.mapper.UserMapper;
import com.claire.castle.db.model.User;
import com.claire.castle.service.UserService;
import com.claire.castle.utils.DES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("userService")
public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private static final String ENCRY_KEYS = "!@$#%$#%^$QWE23512312";

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByName(String name) {
        return userMapper.getUserByName(name);
    }

    @Override
    public void addUser(String name, String passwd,String email) {
        try {
            User user = new User();
            user.setName(name);
            String pwd = DES.encrypt(passwd, ENCRY_KEYS);
            user.setPasswd(pwd);
            user.setEmail(email);
            userMapper.addUser(user);
        } catch (Exception e) {
            LOGGER.warn("add user exception! ex = {}", e);
        }
    }

    @Override
    public User getUserByNameAndPwd(String name, String passwd) {
        try {
            String pwd = DES.encrypt(passwd, ENCRY_KEYS);
            return userMapper.getUserByNameAndPasswd(name, pwd);
        } catch (Exception e) {
            LOGGER.warn("get user exception! ex = {}", e);
        }
        return null;
    }

}
