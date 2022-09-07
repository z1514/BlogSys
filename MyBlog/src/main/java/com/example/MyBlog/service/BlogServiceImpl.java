package com.example.MyBlog.service;

import javax.transaction.Transactional;

import com.example.MyBlog.domain.*;
import com.example.MyBlog.domain.es.EsBlog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.example.MyBlog.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Autowired
	private EsBlogService esBlogService;

	@Transactional
	@Override
	public Blog saveBlog(Blog blog) {
		boolean isNew = (blog.getId()==null);
		EsBlog esBlog = null;

		Blog returnBlog = blogRepository.save(blog);

		if (isNew){
			esBlog = new EsBlog(returnBlog);
		}else{
			esBlog = esBlogService.getEsBlogByBlogId(blog.getId());
			esBlog.update(returnBlog);
		}

		esBlogService.updateEsBlog(esBlog);
		return returnBlog;
	}

	@Transactional
	@Override
	public void removeBlog(Long id) {
		blogRepository.deleteById(id);
		EsBlog esBlog = esBlogService.getEsBlogByBlogId(id);
		esBlogService.removeEsBlog(esBlog.getId());
	}


	@Override
	public Blog getBlogById(Long id) {
		return blogRepository.findById(id).orElse(null);
	}

	@Override
	public Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable) {
		// 模糊查询
		title = "%" + title + "%";
//		Page<Blog> blogs = blogRepository.findByUserAndTitleLikeOrderByCreateTimeDesc(user, title, pageable);
		String tags = title;
		Page<Blog> blogs = blogRepository.findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(title,user,tags,user,pageable);
		return blogs;
	}

	@Override
	public Page<Blog> listBlogsByTitleVoteAndSort(User user, String title, Pageable pageable) {
		// 模糊查询
		title = "%" + title + "%";
		Page<Blog> blogs = blogRepository.findByUserAndTitleLike(user, title, pageable);
		return blogs;
	}

	@Override
	public Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable) {
		Page<Blog> blogs = blogRepository.findByCatalog(catalog, pageable);
		return blogs;
	}

	@Override
	public void readingIncrease(Long id) {
		Blog blog = blogRepository.findById(id).orElse(null);
		blog.setReadSize(blog.getReadSize()+1);
		this.saveBlog(blog);
	}

	@Override
	public Blog createComment(Long blogId, String commentContent) {
		Blog originalBlog = blogRepository.findById(blogId).orElse(null);
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Comment comment = new Comment(user, commentContent);
		originalBlog.addComment(comment);
		return this.saveBlog(originalBlog);
	}

	@Override
	public void removeComment(Long blogId, Long commentId) {
		Blog originalBlog = blogRepository.findById(blogId).orElse(null);
		originalBlog.removeComment(commentId);
		this.saveBlog(originalBlog);
	}

	@Override
	public Blog createVote(Long blogId) {
		Blog originalBlog = blogRepository.findById(blogId).orElse(null);
		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		Vote vote = new Vote(user);
		boolean isExist = originalBlog.addVote(vote);
		if (isExist) {
			throw new IllegalArgumentException("该用户已经点过赞了");
		}
		return this.saveBlog(originalBlog);
	}

	@Override
	public void removeVote(Long blogId, Long voteId) {
		Blog originalBlog = blogRepository.findById(blogId).orElse(null);
		originalBlog.removeVote(voteId);
		this.saveBlog(originalBlog);
	}


}
