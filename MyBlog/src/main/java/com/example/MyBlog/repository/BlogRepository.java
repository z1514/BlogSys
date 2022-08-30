package com.example.MyBlog.repository;

import com.example.MyBlog.domain.Blog;
import com.example.MyBlog.domain.Catalog;
import com.example.MyBlog.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Blog 仓库.
 */
public interface BlogRepository extends JpaRepository<Blog, Long> {
    Page<Blog> findByUserAndTitleLikeOrderByCreateTimeDesc(User user, String title, Pageable pageable);
    Page<Blog> findByUserAndTitleLike(User user, String title, Pageable pageable);
    Page<Blog> findByTitleLikeAndUserOrTagsLikeAndUserOrderByCreateTimeDesc(String title,User user,String tags,User user2,Pageable pageable);
    Page<Blog> findByCatalog(Catalog catalog, Pageable pageable);
}

