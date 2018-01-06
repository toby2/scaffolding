package com.toby.scaffolding.mapper;


import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.dto.u.request.UserQo;

import java.util.List;

/**
 * Created by Toby on 2017/12/17.
 */

public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    List<UserEntity> getBySelective(UserQo qo);
}