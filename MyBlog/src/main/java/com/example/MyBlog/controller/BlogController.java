package com.example.MyBlog.controller;

import com.example.MyBlog.domain.Blog;
import com.example.MyBlog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogRepository blogRepository;

    @GetMapping
    public List<Blog> list(@RequestParam(value="title",required=false,defaultValue="") String title,
                           @RequestParam(value="content",required=false,defaultValue="") String content,
                           @RequestParam(value="pageIndex",required=false,defaultValue="0") int pageIndex,
                           @RequestParam(value="pageSize",required=false,defaultValue="10") int pageSize) {
        Pageable pageable = PageRequest.of(pageIndex, pageSize);
        Page<Blog> page = blogRepository.findByTitleLikeOrContentLike(title,content,pageable);

        return page.getContent();
    }

}
