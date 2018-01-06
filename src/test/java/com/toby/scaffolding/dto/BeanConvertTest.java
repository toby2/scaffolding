package com.toby.scaffolding.dto;

import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.domain.UserStatusEnum;
import com.toby.scaffolding.dto.u.request.UserP;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.modelmapper.ModelMapper;

/**
 * Created by Toby on 2017/12/17.
 */
@Slf4j
public class BeanConvertTest {

    @Test
    public void testConvert() {
        UserP userP = UserP.builder()
                .name("toby")
                .adress("glaxy")
                .middle_school_name("调关二中")
                .high_school_name("南岳高中")
                .university_name("重庆大学")
                .build();
        ModelMapper modelMapper = new ModelMapper();
        UserEntity userEntity = modelMapper.map(userP, UserEntity.class);
        Assert.assertEquals(userP.getName(),userEntity.getName());
        Assert.assertEquals(userP.getAdress(),userEntity.getAdress());
        log.info(UserStatusEnum.OPEN.getStatus());

    }
}
