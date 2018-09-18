package com.banma.bpm.service;

import com.banma.bpm.domain.model.User;

public interface IUserService {


    User getUser(String id);

    /**
     * 新增一条用户信息
     *
     * @param user
     */
    int add(User user);

    /**
     * 修改用户信息
     *
     * @param user
     */
    int update(User user);

    /**
     * 删除用户信息
     *
     * @param id
     */
    int delete(String id);
}
