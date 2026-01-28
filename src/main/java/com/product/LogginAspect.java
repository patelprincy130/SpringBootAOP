package com.product;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(LogginAspect.class);

	@Before("execution(public * com.product.controllers.AlienController.getAlien(String))")
	public void loggingAdvice() {
//		System.out.println("AOP method called");
		LOGGER.info("BEFORE: AOP getAlien with name method called");
	}
	
	@After("execution(public * com.product.controllers.AlienController.getAlien(String))")
	public void loggingAdviceAfter() { //by default it is finally after
		LOGGER.info("AFTER: AOP getAlien with name method called");
	}
}
