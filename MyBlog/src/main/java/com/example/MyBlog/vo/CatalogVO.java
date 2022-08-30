package com.example.MyBlog.vo;

import com.example.MyBlog.domain.Catalog;

import java.io.Serializable;

public class CatalogVO implements Serializable {
    private String username;
    private Catalog catalog;

    public CatalogVO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
