package me.yoogle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YoogleManConfiguration {

    @Bean
    public YoogleMan yoogleMan() {
        YoogleMan yoogleMan = new YoogleMan();
        yoogleMan.setName("yoogle");
        yoogleMan.setHowLong(10);
        return yoogleMan;
    }
}
