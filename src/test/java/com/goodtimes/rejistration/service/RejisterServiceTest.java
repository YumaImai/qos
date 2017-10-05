package com.goodtimes.rejistration.service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class RejisterServiceTest {
	@Test
	public void test001(){
		RejisterService service =new RejisterService();
		try {
		Method method=RejisterService.class.getDeclaredMethod("test");
		method.setAccessible(true);
		try {
			method.invoke(service);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}



	}
}
