package com.yaohuaxiang.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yaohuaxiang.blog_api.entity.Blog;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 16:12
 */

@Mapper
public interface BlogMapper extends BaseMapper<Blog> {
}
