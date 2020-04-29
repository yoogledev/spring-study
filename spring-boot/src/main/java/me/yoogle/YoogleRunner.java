package me.yoogle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YoogleRunner implements ApplicationRunner {

    private Logger logger = LoggerFactory.getLogger(YoogleRunner.class);

    @Autowired
    private String hello;

    @Value("${yoogle.fullname}")
    private String fullName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.debug("=======================");
        logger.debug(hello);
        logger.debug("Test");
        logger.debug("=======================");

        System.out.println("=======================");
        System.out.println(hello);
        System.out.println("=======================");

    }
}
