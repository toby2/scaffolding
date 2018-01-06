package com.toby.scaffolding.biz.u;

import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.dto.u.request.UserP;
import com.toby.scaffolding.dto.u.request.UserQo;
import com.toby.scaffolding.dto.u.response.UserQR;

import java.util.List;

/**
 * @Description
 * @author Toby
 * @date 2017-12-17 16:58:47
 */

public interface IUserService {
    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 保存用户
     * @param user
     * @return
     */
    int saveUser(UserP user);

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    UserEntity getUserById(Integer id);

    /**
     * 更新用户信息
     * @param user
     * @return
     */
    int updateUser(UserP user);

    /**
     * 根据qo查询出结果，支持模糊查询
     * @param qo
     * @return
     */
    UserQR getBySelective(UserQo qo);
}
