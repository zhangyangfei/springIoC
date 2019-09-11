package com.zyf.springIoC.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//猫实现动物接口
//@Component("catbean")
@Component
@Primary //优先权
public class Cat implements Animal {
	@Override
	public void usefor() {
		System.out.println("猫用来捕捉老鼠...");
	}
}
