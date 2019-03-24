package com.org.repository;

import com.org.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data magic :)
public interface BookRepository extends JpaRepository<Book, Long> {
}