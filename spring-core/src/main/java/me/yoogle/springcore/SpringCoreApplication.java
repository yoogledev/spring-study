package me.yoogle.springcore;

import me.yoogle.out.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	@Autowired
	MyService myService;

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(SpringCoreApplication.class).
				initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
					applicationContext.registerBean(MyService.class);
				}).run(args);

//		SpringApplication.run(SpringCoreApplication.class, args);

	}

}
