package com.tudou.mapper.imp;

import com.tudou.vo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper2 {
    int addBook(Book book);

    Book getBookById();

    List<Book> getAllBooks();
}
