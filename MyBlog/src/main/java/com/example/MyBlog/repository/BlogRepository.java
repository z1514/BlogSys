package com.example.MyBlog.repository;

import com.example.MyBlog.domain.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface BlogRepository extends ElasticsearchRepository<Blog,String> {
    Page<Blog> findByTitleLikeOrContentLike(String title, String content, Pageable pageable);
}
