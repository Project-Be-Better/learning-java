package com.roneai.bookservice.repository;

import com.roneai.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);

    boolean existsByIsbn(String isbn);

    List<Book> findByAuthor(String author);

    List<Book> findByTitleContainingIgnoreCase(String title);
}
