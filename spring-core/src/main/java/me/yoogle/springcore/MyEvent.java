package me.yoogle.springcore;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

public class MyEvent extends ApplicationEvent {

    private int data;

    public MyEvent(Object source, int data) {
        super(source);
        this.data = data;
    }

    public int getData() {
        return data;
    }
}
