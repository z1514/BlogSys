package com.example.MyBlog.service;

import com.example.MyBlog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {

    User saveOrUpdateUser(User user);
    User registerUser(User user);
    void removeUser(Long id);
    User getUserById(Long id);
    List<User> listUsers();
    Page<User> listUsersByNameLike(String name, Pageable pageable);
}
