package com.matheusfigueiredo.bookstoremanager.repository;

import com.matheusfigueiredo.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
