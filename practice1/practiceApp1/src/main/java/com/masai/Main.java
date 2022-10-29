package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a=ctx.getBean("a",A.class);
		A a1=ctx.getBean("a",A.class);
	    a.funA();
	    System.out.println(a==a1);
	}

}
