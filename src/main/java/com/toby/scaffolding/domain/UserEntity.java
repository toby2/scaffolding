package com.toby.scaffolding.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author Toby
 * @date 2017-12-17 16:18:46
 */
@Data
public class UserEntity {

    private Integer id;
    /**
     * 名字
     */
    private String name;
    private String adress;
    private String staus;
    private Date c_time;
    private Date u_time;
}