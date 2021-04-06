package com.yaohuaxiang.common.handler;

import com.yaohuaxiang.common.entity.BizException;
import com.yaohuaxiang.common.entity.ResultEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yaohuaxiang
 * @create 2021/3/31 - 17:41
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResultEntity exceptionHandler(Exception e){
        ResultEntity error = ResultEntity.error();
        e.printStackTrace();
        error.setMessage(e.getMessage());
        return error;
    }

    @ExceptionHandler(BizException.class)
    @ResponseBody
    public ResultEntity bizExceptionHandler(BizException e){
        ResultEntity error = ResultEntity.error();
        error.setMessage("异常："+e.getMessage());
        return error;
    }
}
