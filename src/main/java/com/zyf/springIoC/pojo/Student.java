package com.zyf.springIoC.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("studentComp") //表明被扫描到IoC容器，并指定bean名称
@Component
public class Student extends People {

	private static final long serialVersionUID = 4043318722026127650L;

	@Value("8")//指定默认值
	private int grade;
	
	@Value("echo zhang")
	private String englishName;
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

}
