package com.example.MyBlog.service;

import com.example.MyBlog.domain.Comment;
import com.example.MyBlog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public Comment getCommentById(Long id) {
       return commentRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void removeComment(Long id) {
        commentRepository.deleteById(id);
    }
}
