package me.yoogle.springbootsecurity2;

import me.yoogle.springbootsecurity2.account.Account;
import me.yoogle.springbootsecurity2.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountRunner implements ApplicationRunner {

    @Autowired
    AccountService accountService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account yoogle = accountService.createAccount("yoogle", "1234");
        System.out.println("Username : " + yoogle.getUsername() + "password : " + yoogle.getPassword());
    }
}
