package com.claire.castle.db.mapper;


import com.claire.castle.db.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public void addUser(User user);

    public User getUserByName(@Param("name") String name);

    public User getUserByNameAndPasswd(@Param("name") String name, @Param("passwd") String passwd);
}
