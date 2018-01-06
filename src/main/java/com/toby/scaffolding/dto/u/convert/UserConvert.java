package com.toby.scaffolding.dto.u.convert;

import com.toby.scaffolding.domain.EducationEntity;
import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.dto.u.request.UserP;
import com.toby.scaffolding.dto.u.response.UserVo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Toby on 2017/12/17.
 */
@Component
public class UserConvert {

    public static UserEntity userIn2User(UserP dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, UserEntity.class);
    }

    public static EducationEntity userIn2Education(UserP dto) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dto, EducationEntity.class);
    }

    public static UserVo userPo2Vo(UserEntity po) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(po, UserVo.class);
    }

    public static List<UserVo> userPo2Vo(List<UserEntity> pos) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(pos, new TypeToken<List<UserVo>>() {
        }.getType());
    }
}
