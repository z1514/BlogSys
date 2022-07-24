package com.example.MyBlog.repository;

import com.example.MyBlog.domain.User;

import java.util.List;

public interface UserRepository {

    User saveOrUpateUser(User user);
    void deleteUser(Long id);
    User getUserById(Long id);
    List<User> listUser();


}
