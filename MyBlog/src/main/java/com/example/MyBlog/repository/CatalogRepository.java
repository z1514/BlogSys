package com.example.MyBlog.repository;

import com.example.MyBlog.domain.Catalog;
import com.example.MyBlog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Catalog,Long> {
    List<Catalog> findByUser(User user);
    List<Catalog> findByUserAndName(User user,String name);
}
