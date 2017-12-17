package com.toby.scaffolding.mapper;


import com.toby.scaffolding.domain.UserEntity;

/**
 * Created by Toby on 2017/12/17.
 */

public interface UserDao {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(UserEntity record);

    public UserEntity selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(UserEntity record);

}