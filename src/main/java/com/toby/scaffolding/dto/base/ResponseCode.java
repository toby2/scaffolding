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

package com.toby.scaffolding.dto.base;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Toby
 * @since 2017/12/22
 */
@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS("200", "请求成功"),
    SERVER_ERROR("500", "服务器异常，请稍候再试"),
    PARAMETER_ERROR("10001","参数错误");

    private String code;

    private String msg;

}
