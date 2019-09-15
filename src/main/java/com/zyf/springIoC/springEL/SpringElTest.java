package com.zyf.springIoC.springEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringElTest {

	@Value("#{T(System).currentTimeMillis()}")
	private Long initTime;

	@Value("$(server.port)")
	private String serverport;

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

}
