package me.yoogle.springbootmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAdminServer
@SpringBootApplication
public class SpringBootMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMonitorApplication.class, args);
    }

}
