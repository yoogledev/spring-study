package me.yoogle.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    // @Qualifier("yoogleBookRepository")
    private BookRepository bookRepository;

    public void printRepository() {
        System.out.println(bookRepository.getClass());
    }

}
