package com.masai;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
	@Autowired(required = false)
	private B b11;
	
 public void funA() {
	 System.out.println("inside funA of  A class");
	 System.out.println(b11);
 }
 
 @PostConstruct
 public void seTup() {
	 System.out.println("insede setup method");
 }
 
 @PreDestroy
 public void tearDown() {
	 System.err.println("inside tear method");
 }
	

}
