package com.tudou.service;

import com.tudou.mapper.imp.BookMapper2;
import com.tudou.vo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper2 bookMapper;

    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    public List<Book> getAllBooks(){
        return bookMapper.getAllBooks();
    }
}
