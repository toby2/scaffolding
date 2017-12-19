package com.toby.scaffolding.biz.u;

import com.toby.scaffolding.domain.UserEntity;
import com.toby.scaffolding.dto.u.request.UserIn;

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
    int saveUser(UserIn user);

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
    int updateUser(UserIn user);
}
