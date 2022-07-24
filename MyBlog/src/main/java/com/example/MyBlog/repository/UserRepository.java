package com.example.MyBlog.repository;

import com.example.MyBlog.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
