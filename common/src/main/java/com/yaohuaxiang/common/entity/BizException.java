package com.yaohuaxiang.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yaohuaxiang
 * @create 2021/3/31 - 18:09
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BizException extends RuntimeException{
    private String message;
}
