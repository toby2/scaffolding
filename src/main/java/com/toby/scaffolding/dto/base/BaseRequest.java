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

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Toby
 * @since 2017/12/19
 */
@Data
public abstract class BaseRequest {
    /**
     * 请求api的版本号
     */
    @NotEmpty(message = "API版本号不能为空")
    protected String apiVersion;

    /**
     * 对外发行的app版本号
     */
    @NotEmpty(message = "APP版本号不能为空")
    protected String appVersion;
    /**
     * 设备唯一识别号
     */
    protected String uniqueIdentifier;

    /**
     * 设备型号
     */
    protected String deviceType;

    /**
     * 用户ip
     */
    protected String ip;
}
