package me.yoogle.springcore;

import org.springframework.stereotype.Service;

@Service
public interface EventService {

    void createEvent();

    void publishEvent();

    void deleteEvent();

}
