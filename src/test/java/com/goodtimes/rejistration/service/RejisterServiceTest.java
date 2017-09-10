package com.goodtimes.rejistration.service;

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
		service.test();



	}
}
