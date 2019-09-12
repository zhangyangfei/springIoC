package com.zyf.springIoC.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zyf.springIoC.pojo.People;

@Configuration // 表明该类是一个配置类
public class PojoConfig {

	/**
	 * 使用@Bean的方式装备到IoC容器中，此方法可用于自定义第三方bean。
	 * 因为我们不可能去他们的代码里加@Component或@Service的注解。
	 * 
	 * @return
	 */
	@Bean(name = "peopleBean") // 方法返回的实例装备到SpringIoC容器中。给bean命名为userBean。
	// @Bean//bean的名称默认为方法名，首字母变成小写
	@Scope("prototype") //多例模式
	public People initPeople() {
		People people = new People();
		people.setId(1);
		people.setName("zhangsan");
		people.setNote("测试SpringIoC配置bean");
		return people;
	}
}
