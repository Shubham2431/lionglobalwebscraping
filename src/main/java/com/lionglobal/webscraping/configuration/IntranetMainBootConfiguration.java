package com.lionglobal.webscraping.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author Shubham Dubey
 * @CreationDate - 13-02-2023
 * @ModifyDate- 13-02-2023
 */

@SpringBootApplication
@ComponentScan("com.lionglobal.webscraping")
@EnableAutoConfiguration(exclude = { HibernateJpaAutoConfiguration.class })
public class IntranetMainBootConfiguration extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(IntranetMainBootConfiguration.class);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(IntranetMainBootConfiguration.class, args);
		
		
	}
}
