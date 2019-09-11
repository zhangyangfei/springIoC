package com.zyf.springIoC.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 商人实现人类接口
@Component
public class BusinessPerson implements Person {
	
	@Autowired // Animal是一个接口，IoC注入其实现类的实例
	@Qualifier("dog")
	private Animal animal;
	@Override
	public void animalService() {
		animal.usefor();
	}
	@Override
	public void setAnimal(Animal animal) {
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
