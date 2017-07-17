package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(9) //切面等级
public class Aop01 {

	@Pointcut("execution(public * com.controller..*.*(..))")
	public void first(){
		System.out.println("first()");
	}
	
	@Before("first()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
		System.out.println("doBefore后");
	}

}
