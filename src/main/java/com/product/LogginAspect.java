package com.product;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogginAspect {

	@Before("execution(public * com.product.controllers.AlienController.getAlien(String))")
	public void loggingAdvice() {
		System.out.println("AOP method called");
	}
}
