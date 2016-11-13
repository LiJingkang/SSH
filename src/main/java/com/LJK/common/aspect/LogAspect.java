package com.LJK.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

// aop命名空间的其他元素能够让我们直接在Spring配置中声明切面，而不需要使用注解。
@Component // 注入依赖
@Aspect // 该注解标示该类为切面类
public class LogAspect {

	// 为了定义切面内重用的切点，也就是说把公共的东西抽出来
	@Pointcut("execution(* com.LJK.service.impl.UserServiceImpl.*(..))")
	public void logAop() {
		// 定义的切点
	}

	// 多出来个&& args(name),这个是用来传递参数的，定义只要跟sayHello参数名称一样就可以。
	// @Before("logAop() && args(name)")
	// public void logBefore(String name) {
	// System.out.println(name + "前置通知Before");
	// }

	// @AfterReturning("logAop()")
	// public void logAfterReturning() {
	// System.out.println("返回通知AfterReturning");
	// }

	// @After("logAop() && args(name)")
	// public void logAfter(String name) {
	// System.out.println(name + "后置通知After");
	// }

	// @AfterThrowing("logAop()")
	// public void logAfterThrow() {
	// System.out.println("异常通知AfterThrowing");
	// }

	// 环绕通知 可以替代上面的所有通知
	@Around("logAop()")
	public void logAround(ProceedingJoinPoint jp) {
		try {
			System.out.println("自定义前置通知Before");
			// 将控制权交给被通知的方法，也就是执行sayHello方法
			jp.proceed();
			System.out.println("自定义后置通知After");
		} catch (Throwable throwable) {
			System.out.println("异常处理~");
			throwable.printStackTrace();
		}
	}
}
