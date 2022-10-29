package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class A {
	@Value("${roll}")
	int roll;
	
	@Value("${name}")
	String name;
	
	@Value("${marks}")
	int marks;
	
	public void funA() {
		System.out.println("roll id "+roll);
		System.out.println("name is "+name);
		System.out.println("marks is "+marks);
	}

}
