package me.yoogle.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringCoreApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
//		SpringApplication.run(SpringCoreApplication.class, args);
	}
}
