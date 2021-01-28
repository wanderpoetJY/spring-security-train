package com.wander.securitydemo01.service;

import com.wander.securitydemo01.entity.User;

/**
 * user服务
 *
 * @author admin 2021/01/27/ 19:41
 */
public interface UserService {

    /**
     * 通过name查询User
     * @param name 用户名
     * @return User对象
     */
    User selectByName(String name);

    /**
     * 添加用户
     * @param user User对象
     */
    void addUser(User user);
}
