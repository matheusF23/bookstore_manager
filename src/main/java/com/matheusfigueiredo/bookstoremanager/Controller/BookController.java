package com.matheusfigueiredo.bookstoremanager.Controller;

import com.matheusfigueiredo.bookstoremanager.dto.BookDTO;
import com.matheusfigueiredo.bookstoremanager.dto.MessageResponseDTO;
import com.matheusfigueiredo.bookstoremanager.entity.Book;
import com.matheusfigueiredo.bookstoremanager.repository.BookRepository;
import com.matheusfigueiredo.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
}
