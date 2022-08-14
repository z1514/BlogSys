package com.example.MyBlog.service;

import com.example.MyBlog.domain.Comment;

public interface CommentService {
    Comment getCommentById(Long id);
    void removeComment(Long id);
}
