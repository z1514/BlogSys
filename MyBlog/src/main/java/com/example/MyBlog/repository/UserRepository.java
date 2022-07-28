package com.example.MyBlog.repository;

import com.example.MyBlog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


// for pagination query
public interface UserRepository extends JpaRepository<User,Long> {
    Page<User> findByNameLike(String name, Pageable pageable);

    User findByUsername(String username);
}
