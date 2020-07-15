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
	//���������У�����ͨ��֪ͨ���������������ʱ��
	//ƥ��aop.test�������е���ķ���
	//�����з����еĵ�һ��λ����ֲ��checkUser()�Ĵ���
	@Before("execution(* aop.test.*.*(..))")
	public void checkUser(){
		System.out.println("@Before, �������ӵ���Ƿ��¼");
	}
	
	/*
     *  ��������˵��
	 *  ��һ��*ƥ�����������ַ���������ֵ���Ͳ���
	 *  aop.test��ʾ���յ����ڵİ�
	 *  �ڶ���*ƥ������������������������
	 *  ������*ƥ�����ⷽ������������������
	 *   (..)��ʾƥ���������������͵��������
	 *   @After���ڲ��յ���ý���֮��������µĴ���
    */
	@After("execution(* aop.test.*.*(..))")
	public void setLog(){
		System.out.println("@After,����ʵ�ֲ�������־����");
	}
	
	//@Around�����������ӵ����Χֲ�뷽��
	@Around("execution(* aop.test.*.*(..))")
	public void efficientCheck(JoinPoint joinPoint){
		long start = System.currentTimeMillis();
	   	System.out.println("�����񣬿�ʼʱ��Ϊ��"+start);
	   	try {
	   		//joinPoint��������ӵ����Ŀ�귽����ִ����
			((ProceedingJoinPoint) joinPoint).proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   	long end = System.currentTimeMillis();
	   	System.out.println("�ر����񣬽���ʱ��Ϊ��"+end);

	}
	
	
	
	
}