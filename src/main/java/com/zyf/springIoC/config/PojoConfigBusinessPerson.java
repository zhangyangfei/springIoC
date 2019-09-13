package com.zyf.springIoC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.zyf.springIoC.pojo"},lazyInit=false)
public class PojoConfigBusinessPerson {

}
