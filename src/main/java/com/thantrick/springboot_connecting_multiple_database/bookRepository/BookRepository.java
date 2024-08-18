package com.thantrick.springboot_connecting_multiple_database.bookRepository;

import com.thantrick.springboot_connecting_multiple_database.bookEntity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {
}
