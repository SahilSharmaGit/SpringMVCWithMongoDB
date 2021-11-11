package com.atmax.cfg;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import com.atmax.dao.DMLDao;
import com.atmax.dao.impl.DMLDaoImpl;


@ComponentScan("com.atmax.dao.impl")
@Configurable
public class PersistenceConfiguration {
	@Bean("dao")
	public DMLDao getDao() {
		return new DMLDaoImpl();
	}

}
