package me.yoogle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YoogleRunner implements ApplicationRunner {

    @Value("${yoogle.name}")
    private String name;

    @Value("${yoogle.age}")
    private int age;

    @Value("${yoogle.fullname}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("=======================");
        System.out.println(name);
        System.out.println(age);
        System.out.println(fullName);
        System.out.println("=======================");

    }
}
