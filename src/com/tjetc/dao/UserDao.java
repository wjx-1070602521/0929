package com.tjetc.dao;

import com.tjetc.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAllUser();
    int  addUser(User user);
    int  delUser(int id);
    int  update(User user);
}
