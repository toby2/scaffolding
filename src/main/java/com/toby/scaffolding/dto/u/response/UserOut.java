package com.toby.scaffolding.dto.u.response;

import com.toby.scaffolding.domain.EducationEntity;
import com.toby.scaffolding.domain.UserEntity;
import lombok.Data;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
public class UserOut {
    private UserEntity u;

    private EducationEntity education;

    private String tmp;
}
