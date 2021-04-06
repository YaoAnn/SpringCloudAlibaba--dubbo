package com.yaohuaxiang.blog_api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yaohuaxiang.common.entity.BaseEntity;
import com.yaohuaxiang.sys_api.entity.User;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 16:45
 */

@Data
@TableName(value = "bs_author")
public class Author extends BaseEntity implements Serializable {
    private String name;
    private String realName;
    private Integer age;
    private String address;
    private int blogAmount;
    private User user;
}
