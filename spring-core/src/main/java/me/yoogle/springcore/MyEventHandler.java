package me.yoogle.springcore;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public void handler(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받음!" + myEvent.getData());
    }

    @EventListener
    @Async
    public void handler(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("contextRefreshedEvent");
    }

    @EventListener
    @Async
    public void handler(ContextClosedEvent contextClosedEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("contextClosedEvent");
    }
}
