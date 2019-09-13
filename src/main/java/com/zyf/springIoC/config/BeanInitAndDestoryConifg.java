package com.zyf.springIoC.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitAndDestoryConifg {
	@PostConstruct // 全部bean生效后执行
	private void initBean(){
		System.out.println("bean初始化完成了，我需要...");
	}
	
	@PreDestroy // 全部bean销毁前执行
	private void destroy(){
 		System.out.println("bean即将销毁，我需要....");
	}
}
