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

package com.toby.scaffolding.dto.base.r;

import com.toby.scaffolding.dto.base.response.Response;
import lombok.Data;

/**
 * @author Toby
 * @since 2018/1/6
 */
@Data
public abstract class PagingR {
    /**
     * 页数
     */
    private int pageNum;
    /**
     * 每页显示数据条数
     */
    private int pageSize;

    /**
     * 数据总数，用于分页
     */
    private long total;
}
