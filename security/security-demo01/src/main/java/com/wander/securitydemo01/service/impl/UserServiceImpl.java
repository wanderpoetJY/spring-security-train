package com.wander.securitydemo01.service.impl;

import com.wander.securitydemo01.entity.User;
import com.wander.securitydemo01.mapper.UserMapper;
import com.wander.securitydemo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user服务实现类
 *
 * @author admin 2021/01/27/ 19:44
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User selectByName(String name) {
        return userMapper.selectUserByName(name);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }
}
