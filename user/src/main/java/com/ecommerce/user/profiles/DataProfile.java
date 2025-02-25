package com.ecommerce.user.profiles;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataProfile {
	
	@Bean
	@Profile("dev")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUrl("jdbc:mysql://localhost:3306/ecommerce");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}

}
