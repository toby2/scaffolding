/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 */

package com.toby.scaffolding.exception;

import com.toby.scaffolding.dto.base.response.Response;
import com.toby.scaffolding.dto.base.response.ResponseCode;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Toby
 * @since 2017/12/22
 */
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    /**
     * 处理自定义的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BizException.class)
    @ResponseBody
    public Object customHandler(BizException e) {
        e.printStackTrace();
        return Response.builder()
                .code(e.getCode())
                .msg(e.getMessage())
                .build();
    }

    /**
     * 其他未处理的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Object exceptionHandler(Exception e) {
        e.printStackTrace();
        return Response.builder()
                .code(ResponseCode.SERVER_ERROR.getCode())
                .msg(ResponseCode.SERVER_ERROR.getMsg())
                .build();
    }

    /**
     * 按需重新封装需要返回的错误信息
     * 解析原错误信息，封装后返回，此处返回非法的字段名称，原始值，错误信息
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public Object methodArgumentNotValidHandler(MethodArgumentNotValidException exception) {
        List<ArgumentInvalidResult> invalidArguments = new ArrayList<>();
        for (FieldError error : exception.getBindingResult().getFieldErrors()) {
            ArgumentInvalidResult invalidArgument = new ArgumentInvalidResult();
            invalidArgument.setDefaultMessage(error.getDefaultMessage());
            invalidArgument.setField(error.getField());
            invalidArgument.setRejectedValue(error.getRejectedValue());
            invalidArguments.add(invalidArgument);
        }

        return Response.builder()
                .code(ResponseCode.PARAMETER_ERROR.getCode())
                .msg(ResponseCode.PARAMETER_ERROR.getMsg())
                .body(invalidArguments)
                .build();
    }
}
