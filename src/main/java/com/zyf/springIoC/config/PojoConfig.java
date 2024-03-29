package com.zyf.springIoC.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zyf.springIoC.pojo.People;
import com.zyf.springIoC.pojo3.Conditional4People;

@Configuration // 表明该类是一个配置类
public class PojoConfig {
	/**
	 * 使用@Bean的方式装备到IoC容器中，此方法可用于自定义第三方bean。
	 * 因为我们不可能去他们的代码里加@Component或@Service的注解。
	 * @return
	 */
	//@Bean(name = "peopleBean") // 方法返回的实例装备到SpringIoC容器中。给bean命名为userBean。
	@Bean(name = "peopleBean",initMethod = "initPeople",destroyMethod="destoryPeople") //增加bean的初始化和销毁自定义逻辑方法
	@Conditional(Conditional4People.class) //bean条件的装配,Conditional4People.matches()返回true则装配，否则不装配
	// @Bean//bean的名称默认为方法名，首字母变成小写
	@Scope("prototype") //多例模式
	public People initPeople() {
		People people = new People();
		people.setId(1);
		people.setName("zhangsan");
		people.setNote("测试SpringIoC配置bean");
		return people;
	}
	
	/* 注解@Scope控制bean的作用域
	 * single：默认值，单例
	 * prototype：原型，多例
	 * session：spring web应用，http会话
	 * application：spring web应用，web工程生命周期
	 * request：spring web应用，单次请求
	 * globalSession：在一个全局的http session中，一个bean定义对应一个实例。实践中基本不用。
	 */
}
