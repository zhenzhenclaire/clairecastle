package com.claire.castle.service;


import com.claire.castle.db.model.User;

public interface UserService {

    public User getUserByName(String name);

    public void addUser(String name, String passwd,String email);

    public User getUserByNameAndPwd(String name, String passwd);

}
