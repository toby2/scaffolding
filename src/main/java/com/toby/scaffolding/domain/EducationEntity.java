package com.toby.scaffolding.domain;

import lombok.Data;

/**
 * @Description 
 * @author Toby
 * @date 2017-12-17 16:58:47
 */
@Data
public class EducationEntity {

    private Integer id;
    //高中学校名称
    private String high_school_name;
    //中学名称
    private String middle_school_name;
    //大学名称
    private String university_name;
}