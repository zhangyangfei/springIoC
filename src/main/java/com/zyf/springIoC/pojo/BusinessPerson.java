package com.zyf.springIoC.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 商人实现人类接口
@Component
public class BusinessPerson implements Person {
	@Autowired // Animal是一个接口，IoC注入其实现类的实例
	private Animal animal;
	@Override
	public void animalService() {
		animal.usefor();
	}
	@Override
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
