package com.roneai.bookservice.service;

import com.roneai.bookservice.entity.Book;
import com.roneai.bookservice.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    };

    public Book createBook(Book book){
        return bookRepository.save(book);
    };

}
