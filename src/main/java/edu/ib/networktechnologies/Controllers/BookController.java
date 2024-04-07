package edu.ib.networktechnologies.Controllers;

import edu.ib.networktechnologies.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @PostMapping("/add")
    public @ResponseBody Book addBook (@RequestBody Book book){
        return bookRepository.save(book);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<Book> getAll(){
        return bookRepository.findAll();
    }
}