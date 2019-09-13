package com.zyf.springIoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zyf.springIoC.config.PojoConfig;
import com.zyf.springIoC.config.PojoConfigBusinessPerson;
import com.zyf.springIoC.config.PojoConfigStudent;
import com.zyf.springIoC.pojo.Animal;
import com.zyf.springIoC.pojo.BusinessPerson;
import com.zyf.springIoC.pojo.Dog;
import com.zyf.springIoC.pojo.People;
import com.zyf.springIoC.pojo.Person;
import com.zyf.springIoC.pojo.Student;

@SpringBootApplication
public class SpringIoCApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIoCApplication.class, args);
//		test装配bean();
//		test获取bean();
		test条件获取Bean();
	}

	@SuppressWarnings("resource")
	static void test条件获取Bean() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(PojoConfig.class);
		People people = ac.getBean(People.class);
	}
	
	@SuppressWarnings("resource")
	static void test获取bean() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(PojoConfigBusinessPerson.class);
		Dog dog = ac.getBean(Dog.class);
		System.out.print("dog : ");
		dog.usefor();
		Animal am = ac.getBean(Animal.class);
		System.out.print("animal : ");
		am.usefor();
		Person bp = ac.getBean(Person.class);
		System.out.print("Person.animalService : ");
		bp.animalService();
	}

	@SuppressWarnings("resource")
	static void test装配bean() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(PojoConfig.class);
		People people = ac.getBean(People.class);
		System.out.println(people.getNote());
		People people1 = (People) ac.getBean("peopleBean");
		System.out.println("people与people1是否为同一个对象：" + (people == people1));
		// bean默认为单例
		System.out.println("peopleBean isSingleton = " + ac.isSingleton("peopleBean"));
		System.out.println("peopleBean isPrototype = " + ac.isPrototype("peopleBean"));

		ApplicationContext ac2 = new AnnotationConfigApplicationContext(PojoConfigStudent.class);
		Student student = ac2.getBean(Student.class);
		System.out.println(student);
		// System.out.println("studentComp = " + ac2.getBean("studentComp"));
		System.out.println("student = " + ac2.getBean("student"));
	}
}
