package com.example.MyBlog.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.MyBlog.domain.Blog;
import com.example.MyBlog.domain.User;


public interface BlogService {
	Blog saveBlog(Blog blog);
	void removeBlog(Long id);
	Blog updateBlog(Blog blog);
	Blog getBlogById(Long id);
	Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable);
	Page<Blog> listBlogsByTitleVoteAndSort(User user, String title, Pageable pageable);
	void readingIncrease(Long id);
	Blog createComment(Long blogId, String commentContent);
	void removeComment(Long blogId, Long commentId);
	Blog createVote(Long blogId);
	void removeVote(Long blogId, Long voteId);
}
