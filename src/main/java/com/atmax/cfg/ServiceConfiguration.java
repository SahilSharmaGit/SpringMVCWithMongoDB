package com.atmax.cfg;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.atmax.service.AtmaxService;
import com.atmax.service.impl.AtmaxServiceImpl;


@ComponentScan("com.atmax.service.impl")
@Configurable
public class ServiceConfiguration {

	@Bean("service")
	public AtmaxService getService()
	{
		return new AtmaxServiceImpl();
	}

}
