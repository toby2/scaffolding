package com.toby.scaffolding.dto.u.out;

import com.toby.scaffolding.domain.EducationEntity;
import com.toby.scaffolding.domain.UserEntity;
import lombok.Data;

import java.util.Date;

/**
 * Created by Toby on 2017/12/17.
 */

@Data
public class UserOut {
    private UserEntity u;

    private EducationEntity education;

    private String tmp;
}
