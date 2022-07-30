package com.example.MyBlog.service;

import com.example.MyBlog.domain.Authority;
import com.example.MyBlog.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorityServiceImpl implements AuthorityService{

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority getAuthorityById(Long id) {
        Optional<Authority> optional =  authorityRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }
}
