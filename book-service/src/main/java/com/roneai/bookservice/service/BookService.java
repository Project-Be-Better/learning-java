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
    };

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    };

    public Book createBook(Book book) {
        return bookRepository.save(book);
    };

    public Book getBookById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Book ID cannot be null");
        }
        return bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    };

    public Book updateBook(Long id,Book bookDetails) {
        if (id == null) {
            throw new IllegalArgumentException("Book ID cannot be null");
        }
        if (bookDetails == null) {
            throw new IllegalArgumentException("Book Details ID cannot be null");
        }


        Book existingBook =  bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));

        Book updatedBook = new Book(
                existingBook.getId(),
                bookDetails.getTitle(),
                bookDetails.getAuthor(),
                bookDetails.getIsbn(),
                bookDetails.getDescription(),
                bookDetails.getPrice()
        );
        return bookRepository.save(updatedBook);
    };


}