package com.product;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	//if we have both at a time, after finally and after returning then after returning will be called first and then after finally
//	@After("execution(public * com.product.controllers.AlienController.getAlien(String))")
//	public void loggingAdviceAfter() { //by default it is finally after
//		LOGGER.info("AFTER: AOP getAlien with name method called");
//	}
	
	@AfterReturning("execution(public * com.product.controllers.AlienController.getAlien(String))")
	public void loggingAdviceAfterReturning() { //this will only called after the successful execution without exception, as we have exception in controller so it will not be called
		LOGGER.info("AFTER RETURNING: AOP getAlien with name method called without exception");
	}
	
	@AfterThrowing("execution(public * com.product.controllers.AlienController.getAlien(String))")
	public void loggingAdviceAfterThrowing() { //this will only called after the successful execution without exception, as we have exception in controller so it will not be called
		LOGGER.info("AFTER THROWING: AOP getAlien with name method called with EXCEPTION");
	}
}
