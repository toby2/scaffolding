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

/**
 * 返回给App显示的异常信息
 * @author Toby
 * @since 2017/12/22
 */
public class BizException extends RuntimeException {
    private String code;

    public BizException(String msg, String code) {
        super(msg);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
