package me.yoogle.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
// @Primary 어노테이션으로 두가지 같은 타입의 Bean이 존재할 때 식별해준다.
public class MyBookRepository implements BookRepository{
}
