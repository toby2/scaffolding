package com.toby.scaffolding.biz.u.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.toby.scaffolding.biz.u.IUserService;
import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.domain.UserStatusEnum;
import com.toby.scaffolding.dto.u.convert.UserConvert;
import com.toby.scaffolding.dto.u.request.UserP;
import com.toby.scaffolding.dto.u.request.UserQo;
import com.toby.scaffolding.dto.u.response.UserQR;
import com.toby.scaffolding.mapper.EducationDao;
import com.toby.scaffolding.mapper.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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
    public int saveUser(UserP user) {
        educationDao.insertSelective(UserConvert.userIn2Education(user));
        UserEntity userEntity = UserConvert.userIn2User(user);
        userEntity.setStaus(UserStatusEnum.OPEN.getStatus());
        userEntity.setC_time(new Date());
        userEntity.setU_time(new Date());
        return userDao.insertSelective(userEntity);
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return null;
    }

    @Override
    public int updateUser(UserP user) {
        return 0;
    }

    @Override
    public UserQR getBySelective(UserQo qo) {
        Page<UserEntity> page = PageHelper.startPage(qo.getPageNum(), qo.getPageSize())
                .doSelectPage(() -> userDao.getBySelective(qo));
        UserQR userQR = new UserQR();
        userQR.setPageNum(page.getPageNum());
        userQR.setPageSize(page.getPageSize());
        userQR.setTotal(page.getTotal());
        userQR.setUserVoList(UserConvert.userPo2Vo(page.getResult()));
        return userQR;
    }
}
