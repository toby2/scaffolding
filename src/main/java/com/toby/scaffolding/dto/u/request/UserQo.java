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

package com.toby.scaffolding.dto.u.request;

import com.toby.scaffolding.dto.base.p.PagingP;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserQo extends PagingP {
    private String name;
    private String adress;
}
