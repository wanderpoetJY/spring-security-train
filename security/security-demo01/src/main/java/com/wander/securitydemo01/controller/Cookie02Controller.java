package com.wander.securitydemo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * cookie测试
 *
 * @author admin 2021/01/28/ 20:00
 */
@RestController
public class Cookie02Controller {

    @GetMapping("/cookie03")
    public String cookie03(){

        return "cookie03";
    }

    @GetMapping("/cookie04")
    public String cookie04(){

        return "cookie04";
    }
}
