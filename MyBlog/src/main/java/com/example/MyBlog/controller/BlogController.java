package com.example.MyBlog.controller;

import com.example.MyBlog.domain.Blog;
import com.example.MyBlog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping
    public String listBlogs(@RequestParam(value="order",required=false,defaultValue="new") String order,
                            @RequestParam(value="keyword",required=false, defaultValue = "" ) String keyword) {
        System.out.println("order:" +order + ";keyword:" +keyword );
        return "redirect:/index?order="+order+"&keyword="+keyword;
    }

}
