package com.zyf.springIoC.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
// @PropertySource将指定属性文件的内容加载到spring的上下文中，classpath表示去资源文件夹下寻找该文件
@PropertySource({ "classpath:application.properties" })
public class SpringElTest {

	/**
	 * 给成员变量赋值：某类的方法返回值 
	 * @Value("#(T(类的全限定名).方法())")
	 */
	@Value("#{T(System).currentTimeMillis()}")
	private Long initTime;

	/**
	 * 给成员变量赋值：属性文件的key对应value 
	 * @Value{"${key}"}
	 */
	@Value("${server.port}")
	private String serverport;

	/**
	 * 给成员变量赋值：其他bean的属性 
	 * @Value{"#{bean的名字.属性}"}
	 */
	@Value("#{student.grade}")
	private int grade;

	// 加法
	@Value("#{student.grade+1}")
	private int grade2;

	// 转换为大写，?为判断是否为空
	@Value("#{student.englishName?.toUpperCase()}")
	private String nameUpper;
	
	// 判断字符串是否相同
	@Value("#{student.englishName eq 'echo zhang'}")
	private boolean isEcho;

	// 文件
	@Value("classpath:application.properties")
	private Resource testFile;
	
	// 浮点数
	@Value("#{3.14f}")
	private float pi;
	
	public Resource getTestFile() {
		return testFile;
	}

	public void setTestFile(Resource testFile) {
		this.testFile = testFile;
	}

	public Long getInitTime() {
		return initTime;
	}

	public void setInitTime(Long initTime) {
		this.initTime = initTime;
	}

	public String getServerport() {
		return serverport;
	}

	public void setServerport(String serverport) {
		this.serverport = serverport;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public String getNameUpper() {
		return nameUpper;
	}

	public void setNameUpper(String nameUpper) {
		this.nameUpper = nameUpper;
	}

	public boolean isEcho() {
		return isEcho;
	}

	public void setEcho(boolean isEcho) {
		this.isEcho = isEcho;
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

}
