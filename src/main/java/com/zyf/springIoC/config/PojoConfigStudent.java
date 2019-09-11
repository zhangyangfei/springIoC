package com.zyf.springIoC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zyf.springIoC.pojo.Student;

@Configuration
@ComponentScan // 扫描当前报及子包
@ComponentScan("com.zyf.springIoC.pojo") // 扫描指定包
@ComponentScan("com.zyf.springIoC.*") // 扫描指定包，可用通配符*，会扫描其子包
@ComponentScan(basePackages = { "com.zyf.springIoC.pojo" }) // 指定扫描基础包，会扫描其子包
@ComponentScan(basePackageClasses = { Student.class }) // 指定类
public class PojoConfigStudent {
}
