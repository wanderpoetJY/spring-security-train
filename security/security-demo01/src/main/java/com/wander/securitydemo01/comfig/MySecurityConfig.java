package com.wander.securitydemo01.comfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * security配置类实现自定义登录用户名，密码
 *
 * @author admin 2021/01/27/ 14:44
 */
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    PasswordEncoder passwordEncoder;



    /**
     * 配置security的加密方式
     */
    @Bean
    public PasswordEncoder getPw(){
        return new BCryptPasswordEncoder();
    }

    /**
     *自定义用户的获取逻辑
     */
/*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        String encode = passwordEncoder.encode("123");
        auth.inMemoryAuthentication().withUser("admin").password(encode).roles("admin");
    }*/


}
