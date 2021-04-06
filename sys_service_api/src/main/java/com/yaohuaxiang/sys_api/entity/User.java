package com.yaohuaxiang.sys_api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yaohuaxiang.common.entity.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 17:01
 */

@Data
@TableName(value = "sys_user")
public class User extends BaseEntity implements Serializable {
    private String username;
    private String password;
    private String mobile;
}
