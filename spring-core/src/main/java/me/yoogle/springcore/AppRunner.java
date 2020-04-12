package me.yoogle.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        applicationEventPublisher.publishEvent(new MyEvent(this, 5000));
//        while(true) {
//            System.out.println(messageSource.getMessage("greeting", new String[]{"yoogle"}, Locale.ENGLISH));
//            System.out.println(messageSource.getMessage("greeting", new String[]{"yoogle"}, Locale.KOREA));
//            Thread.sleep(1000l);
//        }
    }
}
