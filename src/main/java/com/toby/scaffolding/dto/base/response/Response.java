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

package com.toby.scaffolding.dto.base.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author Toby
 * @since 2017/12/20
 */
@Data
@Builder
public class Response<T> {
    /**
     * 状态码
     */
    private String code = "200";

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 各个接口返回的数据
     */
    private T body;

    /**
     * 默认返回成功的Response
     *
     * @param body
     * @return
     */
    public static Response getInstance(Object body) {
        return Response.builder()
                .code(ResponseCode.SUCCESS.getCode())
                .msg(ResponseCode.SUCCESS.getMsg())
                .body(body)
                .build();
    }
}
