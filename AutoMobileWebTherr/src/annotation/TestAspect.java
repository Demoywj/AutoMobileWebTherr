package annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {
	//在切面类中，我们通过通知方法来定义切入的时机
	//匹配aop.test下面所有的类的方法
	//在所有方法中的第一行位置上植入checkUser()的代码
	@Before("execution(* aop.test.*.*(..))")
	public void checkUser(){
		System.out.println("@Before, 我来检查拥护是否登录");
	}
	
	/*
     *  本案例中说明
	 *  第一个*匹配任意数量字符，代表返回值类型不限
	 *  aop.test表示参照点所在的包
	 *  第二个*匹配任意类名，代表类名不限
	 *  第三个*匹配任意方法名，代表方法名不限
	 *   (..)表示匹配任意数量和类型的输入参数
	 *   @After是在参照点调用结束之后插入以下的代码
    */
	@After("execution(* aop.test.*.*(..))")
	public void setLog(){
		System.out.println("@After,我来实现操作的日志保存");
	}
	
	//@Around是用于在连接点的周围植入方法
	@Around("execution(* aop.test.*.*(..))")
	public void efficientCheck(JoinPoint joinPoint){
		long start = System.currentTimeMillis();
	   	System.out.println("打开事务，开始时间为："+start);
	   	try {
	   		//joinPoint代表的连接点就是目标方法的执行体
			((ProceedingJoinPoint) joinPoint).proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	long end = System.currentTimeMillis();
	   	System.out.println("关闭事务，结束时间为："+end);

	}
	
	
	
	
}