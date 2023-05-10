package com.tudou.controller;

import com.tudou.service.BookService;
import com.tudou.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/bookOpts")
    public void bookOpts() {
        Book b1 = new Book();
        b1.setId(1);
        b1.setName("西哟及");
        b1.setAuthor("罗贯中");
        Book b2 = new Book();
        b2.setId(2);
        b2.setName("三国演义");
        b2.setAuthor("吴承恩");
        bookService.addBook(b1);
        bookService.addBook(b2);
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println(allBooks);
    }
}
