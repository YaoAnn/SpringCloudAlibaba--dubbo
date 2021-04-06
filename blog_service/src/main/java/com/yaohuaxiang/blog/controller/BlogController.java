package com.yaohuaxiang.blog.controller;

import com.yaohuaxiang.blog_api.entity.Blog;
import com.yaohuaxiang.common.entity.ResultEntity;
import com.yaohuaxiang.blog_api.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 18:38
 */

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/getAll")
    public ResultEntity getAll(){
        List<Blog> blogs = blogService.list();
        return ResultEntity.ok().setData("data",blogs);
    }

}
