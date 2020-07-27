package me.yoogle.demoreactor;

import reactor.core.publisher.Flux;

public class DemoreactorApplication {

    public static void main(String[] args) {
        Flux<String> flux = Flux.just("A");
        Flux<String> flux2 = flux.map(i -> "foo" + i);
        flux2.subscribe(System.out::println);
    }

}
