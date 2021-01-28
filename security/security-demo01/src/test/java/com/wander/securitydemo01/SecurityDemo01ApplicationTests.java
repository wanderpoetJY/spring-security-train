package com.wander.securitydemo01;

import com.wander.securitydemo01.entity.User;
import com.wander.securitydemo01.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class SecurityDemo01ApplicationTests {
	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	UserServiceImpl userService;

	@Test
	void contextLoads() {
		userService.addUser(new User("bili",passwordEncoder.encode("123")));
	}

}
