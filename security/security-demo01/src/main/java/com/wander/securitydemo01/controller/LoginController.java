package com.wander.securitydemo01.controller;

import com.wander.securitydemo01.entity.User;
import com.wander.securitydemo01.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 登录controller
 *
 * @author admin 2021/01/27/ 14:17
 */
@RestController
public class LoginController {

    @Autowired
    UserServiceImpl userService;

    /*@GetMapping
    public void getUser(@PathVariable("name") String name){
        System.out.println(userService.selectByName(name));
    }
*/
    @GetMapping("/test")
    public String test(){

        return "测试成功！";
   }
}
