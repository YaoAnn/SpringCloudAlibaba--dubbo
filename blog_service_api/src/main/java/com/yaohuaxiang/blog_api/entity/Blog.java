package com.yaohuaxiang.blog_api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yaohuaxiang.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 16:22
 */
@Data
@TableName(value = "bs_blog")
public class Blog extends BaseEntity implements Serializable {
    private String title;
    private String content;
    private Author author;
    private String remark;

}
