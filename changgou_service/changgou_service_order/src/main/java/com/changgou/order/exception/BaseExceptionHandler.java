package com.changgou.order.exception;

import com.changgou.common.pojo.Result;
import com.changgou.common.pojo.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Haotian
 * @Date: 2020/1/24 20:10
 * @Description: 公共异常处理
 */
@ControllerAdvice
@Slf4j
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result<Object> error(Exception e) {
        e.printStackTrace();
        return Result.builder()
                .flag( false )
                .code( StatusCode.ERROR )
                .message( e.getMessage() ).build();
    }
}