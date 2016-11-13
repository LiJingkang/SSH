package com.LJK.Controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.LJK.service.UserService;

// 使用了Spring的SpringJUnit4ClassRunner
// 测试开始的时候自动创建Spring的应用上下文
@RunWith(SpringJUnit4ClassRunner.class)
// 启动时需要加载的配置文件
@ContextConfiguration({ "classpath:applicationContext.xml" })
public class UserConTrollerTest {
	@Autowired
	UserService userService;

	@Test
	public void checkServiceIsNull() {
		Assert.assertNotNull(userService);
	}
}