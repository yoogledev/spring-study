package me.yoogle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(YoogleManProperties.class)
public class YoogleManConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public YoogleMan yoogleMan(YoogleManProperties properties) {
        YoogleMan yoogleMan = new YoogleMan();
        yoogleMan.setName(properties.getName());
        yoogleMan.setHowLong(properties.getHowLong());
        return yoogleMan;
    }
}
