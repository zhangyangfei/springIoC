package com.zyf.springIoC.pojo3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class Conditional4People implements Condition {//要实现Condition接口
	// 返回是否需要装配bean
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// 增加业务逻辑....
		return false;
	}
}
