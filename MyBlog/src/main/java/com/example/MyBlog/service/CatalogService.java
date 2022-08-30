package com.example.MyBlog.service;

import com.example.MyBlog.domain.Catalog;
import com.example.MyBlog.domain.User;

import java.io.Serializable;
import java.util.List;

public interface CatalogService {
    Catalog saveCatalog(Catalog catalog);
    void removeCatalog(Long id);
    Catalog getCatalogById(Long id);
    List<Catalog> listCatalogs(User user);
}
