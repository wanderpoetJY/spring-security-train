package com.wander.securitydemo01.comfig;

import com.wander.securitydemo01.entity.User;
import com.wander.securitydemo01.service.UserService;
import com.wander.securitydemo01.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 通过查询数据库数据自定义security登录用户名，密码
 *
 * @author admin 2021/01/27/ 19:52
 */
@Service
public class MyUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.selectByName(s);

       return new org.springframework.security.core.userdetails.User(
                user.getName(), user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("user"));
    }
}
