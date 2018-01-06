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

import com.toby.scaffolding.dto.base.r.PagingR;
import lombok.Data;

import java.util.List;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
public class UserQR extends PagingR {
    private List<UserVo> userVoList;
}
