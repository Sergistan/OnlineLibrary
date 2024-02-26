package com.sergistan.onlinelibrary.services;

import com.sergistan.onlinelibrary.models.Book;
import com.sergistan.onlinelibrary.repositoties.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {

    private final BookRepository bookRepository;

    @Autowired
    public LibraryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> all() {
        return bookRepository.findAll();
    }
}
