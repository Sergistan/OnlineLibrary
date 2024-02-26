package com.sergistan.onlinelibrary.controllers;

import com.sergistan.onlinelibrary.models.Book;
import com.sergistan.onlinelibrary.services.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    private final LibraryService libraryService;

    @Autowired
    public BookController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }


    @GetMapping("/all")
    public List<Book> books (){
        return libraryService.all();
    }

}
