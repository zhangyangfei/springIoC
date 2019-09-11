package com.zyf.springIoC.pojo;

import org.springframework.stereotype.Component;

// 狗实现动物接口
@Component
public class Dog implements Animal {
	@Override
	public void usefor() {
		System.out.println("狗可以用来看家");
	}
}
