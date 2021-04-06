package com.yaohuaxiang.blog_api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yaohuaxiang.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 17:05
 */

@Data
@TableName(value = "bs_comment")
public class Comment extends BaseEntity implements Serializable {
    private String content;
    private Blog blog;
    private Author author;
}
