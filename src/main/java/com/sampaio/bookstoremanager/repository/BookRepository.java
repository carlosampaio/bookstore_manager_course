package com.sampaio.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sampaio.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
