package com.zyf.springIoC.pojo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

// 商人实现人类接口
@Component
@Lazy // 其默认值是 true
//@Lazy(value = false)
public class BusinessPerson implements Person {
	
//	@Autowired // Animal是一个接口，IoC注入其实现类的实例，该注解也可以加在方法上
//	@Qualifier("dog") // 该注解指定只注入bean名称是dog的实例
	private Animal animal;
	@Override
	public void animalService() {
		animal.usefor();
	}
	
	@Override
	@Autowired @Qualifier("dog") 
	public void setAnimal(Animal animal) {
		System.out.println("延时加载...测试....");
		this.animal = animal;
	}
	
	/*
	private Animal animal;
	public BusinessPerson(@Autowired @Qualifier("cat") Animal animal){
		this.animal = animal;
	}
	*/
	
	/*
	@Autowired // Animal是一个接口，IoC注入其实现类的实例
	private Animal catbean;//变量名用cat的装配bean的名称，不是类名
	@Override
	public void animalService() {
		catbean.usefor();
	}
	@Override
	public void setAnimal(Animal animal) {
		this.catbean = animal;
	}
	*/
}
