package com.yaohuaxiang.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yaohuaxiang
 * @create 2021/3/30 - 14:09
 */
@Data
public class ResultEntity implements Serializable {
    private boolean success;
    private Map<String, Object> data = new HashMap<>();
    private String message;

    private ResultEntity() {
    }

    public static ResultEntity ok() {
        ResultEntity result = new ResultEntity();
        result.setSuccess(true);
        return result;
    }

    public static ResultEntity error() {
        ResultEntity result = new ResultEntity();
        result.setSuccess(false);
        return result;
    }

    public ResultEntity setData(String k, Object v) {
        this.data.put(k, v);
        return this;
    }
}
