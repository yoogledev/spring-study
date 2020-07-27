package me.yoogle.demoreactor;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class DemoreactorApplication {

    public static void main(String[] args) throws Exception {
        Flux.interval(Duration.ofMillis(100))
                .take(10)
                .subscribe(System.out::println);

        System.out.println("여기 먼저??");
        Thread.sleep(5000);
    }

}
