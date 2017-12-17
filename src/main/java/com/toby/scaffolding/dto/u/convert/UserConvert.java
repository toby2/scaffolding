package com.toby.scaffolding.dto.u.convert;

import com.toby.scaffolding.domain.EducationEntity;
import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.dto.u.in.UserIn;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

/**
 * Created by Toby on 2017/12/17.
 */
@Component
public class UserConvert {

    public static UserEntity UserIn2User(UserIn dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, UserEntity.class);
    }

    public static EducationEntity UserIn2Education(UserIn dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, EducationEntity.class);
    }
}
