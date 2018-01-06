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

package com.toby.scaffolding.dto.base.request;

import com.toby.scaffolding.dto.base.request.BaseRequest;
import lombok.Data;

import javax.validation.Valid;

/**
 * @author Toby
 * @since 2017/12/19
 */
@Data
public class Request<T> extends BaseRequest {
    /**
     * 用户id
     */
    protected String userId;

    /**
     * 请求认证的token
     */
    protected String token;

    @Valid
    private T body;
}
