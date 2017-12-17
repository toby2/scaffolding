package com.toby.scaffolding.mapper;

import com.toby.scaffolding.domain.EducationEntity;

/**
 * Created by Toby on 2017/12/17.
 */

public interface EducationDao {

    public int deleteByPrimaryKey(Integer id);

    public int insertSelective(EducationEntity record);

    public EducationEntity selectByPrimaryKey(Integer id);

    public int updateByPrimaryKeySelective(EducationEntity record);

}