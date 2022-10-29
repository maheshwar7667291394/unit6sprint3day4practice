package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("A.properties")
public class Appconfig {
	
     @Bean
	public List<String>  getList(){
    	 List<String> city=new ArrayList<>();
    	 city.add("ram");
    	 city.add("ram");
    	 city.add("ram");
    	 city.add("ram");
    	 city.add("ram");
    	 return city;
     }
     
	

	

	
}
