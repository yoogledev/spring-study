package me.yoogle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class YoogleManRunner implements ApplicationRunner {

    @Autowired
    YoogleMan yoogleMan;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(yoogleMan.toString());
    }
}
