package com.xaohii.swaggerdemo;

import com.xaohii.swaggerdemo.controller.UserController;
import com.xaohii.swaggerdemo.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:applicayion.yaml")
class SwaggerDemoApplicationTests {
	@Autowired
	private UserController userController;

	@Resource
	private UserServiceImpl userService;

	@Test
	public void testForUserController() {
		System.out.println(userService.index());
	}
}
