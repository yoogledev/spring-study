package me.yoogle.springbootmongo;

import me.yoogle.springbootmongo.acoount.Account;
import me.yoogle.springbootmongo.acoount.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class SpringBootMongoApplication {

    @Autowired
    AccountRepository accountRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMongoApplication.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner() {
        return args -> {
            Account account = new Account();
            account.setId("zxcv");
            account.setEmail("dmltjs851@gmail.com");
            account.setUsername("qwer");
            accountRepository.insert(account);

            System.out.println("finishwed");

        };
    }

}
