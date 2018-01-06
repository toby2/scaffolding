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

package com.toby.scaffolding.dto.u.response;

import lombok.Data;

/**
 * @author Toby
 * @since 2018/1/6
 */
@Data
public class UserVo {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 名字
     */
    private String name;

    /**
     * 地址
     */
    private String adress;

    /**
     * 高中
     */
    private String high_school_name;
    /**
     * 中学
     */
    private String middle_school_name;
    /**
     * 大学
     */
    private String university_name;
}
