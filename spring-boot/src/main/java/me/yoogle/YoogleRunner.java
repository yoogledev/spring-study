package me.yoogle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YoogleRunner implements ApplicationRunner {

    @Autowired
    YoogleProperties yoogleProperties;

    @Value("${yoogle.fullname}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(yoogleProperties.getName());
        System.out.println(yoogleProperties.getAge());
        System.out.println(yoogleProperties.getSessionTimeout());
        System.out.println("=======================");

    }
}
