package com.yaohuaxiang.common.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 16:24
 */

public class BaseEntity implements Serializable {

    @TableId(type = IdType.AUTO)
    private Long id;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableLogic(value = "1", delval = "0")
    @TableField(fill = FieldFill.INSERT)
    private boolean valid;

    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
