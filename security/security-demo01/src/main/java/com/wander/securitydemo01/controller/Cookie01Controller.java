package com.wander.securitydemo01.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cookie测试
 *
 * @author admin 2021/01/28/ 20:00
 */
@RestController
public class Cookie01Controller {

    @GetMapping
    public String addCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("cookie", "Cookie01Controller");
        response.addCookie(cookie);
        return "addCookie";
    }

    @GetMapping("/cookie01")
    public String cookie01(){

        return "cookie01";
    }

    @GetMapping("/cookie02")
    public String cookie02(){

        return "cookie02";
    }
}
