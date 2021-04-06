package com.yaohuaxiang.blog.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yaohuaxiang.blog_api.entity.Blog;
import com.yaohuaxiang.blog.mapper.BlogMapper;
import com.yaohuaxiang.blog_api.service.BlogService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 18:26
 */
@Service
@Component
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Autowired(required = false)
    BlogMapper blogMapper;

}
