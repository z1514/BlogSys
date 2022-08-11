package com.example.MyBlog.service;

import com.example.MyBlog.domain.Authority;

public interface AuthorityService {
    /**
     * 根据id获取 Authority
     * @param Authority
     * @return
     */
    Authority getAuthorityById(Long id);
}
