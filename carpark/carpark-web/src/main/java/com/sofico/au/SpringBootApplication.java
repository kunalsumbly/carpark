package com.sofico.au;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // is the used to register bean and enable annotations is same as
				// defining a bean in xml and using <context:annotation-config/>
// to enable the annotation
@EnableAutoConfiguration // Spring Boot auto-configuration attempts to
							// automatically configure your Spring application
							// based on the jar dependencies that you have added
@ComponentScan({ "com.au.sofico" }) // seems same as <context:component-scan>
									// which not only enables the annotations
									// but also registers the bean in the
									// context or IOC container
// @EnableJpaRepositories({"com.au.sofico"}) // specific to JPA repositories
// @EntityScan({"com.au.sofico"})// JPA entity scan
public class SpringBootApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
}
