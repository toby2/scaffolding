package com.toby.scaffolding.biz.u.impl;


import com.toby.scaffolding.biz.u.IUserService;
import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.domain.UserStatusEnum;
import com.toby.scaffolding.dto.u.convert.UserConvert;
import com.toby.scaffolding.dto.u.request.UserIn;
import com.toby.scaffolding.mapper.EducationDao;
import com.toby.scaffolding.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Toby
 * @date 2017-12-17 16:58:47
 */
@Slf4j
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private EducationDao educationDao;


    @Override
    public int deleteUser(Integer id) {
        return 0;
    }

    @Override
    public int saveUser(UserIn user) {
        educationDao.insertSelective(UserConvert.UserIn2Education(user));
        UserEntity userEntity = UserConvert.UserIn2User(user);
        userEntity.setStaus(UserStatusEnum.OPEN.getStatus());
        userEntity.setC_time(new Date());
        userEntity.setU_time(new Date());
        int i = userDao.insertSelective(userEntity);
        return i;
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return null;
    }

    @Override
    public int updateUser(UserIn user) {
        return 0;
    }
}
