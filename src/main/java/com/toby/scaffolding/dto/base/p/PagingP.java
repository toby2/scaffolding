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

package com.toby.scaffolding.dto.base.p;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.toby.scaffolding.common.Constants;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Toby
 * @since 2018/1/6
 */
@Data
public abstract class PagingP {
    /**
     * 页数
     */
    private int pageNum = Constants.DEFAULT_PAGE_NUM;

    /**
     * 每页显示数据条数
     */
    private int pageSize = Constants.DEFAULT_PAGE_SIZE;
}
