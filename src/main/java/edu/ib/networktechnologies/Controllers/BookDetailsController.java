package edu.ib.networktechnologies.Controllers;

import edu.ib.networktechnologies.Repositories.BookDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.ib.networktechnologies.Entities.BookDetails;

@RestController
@RequestMapping("/bookdetails")
public class BookDetailsController {

    private BookDetailsRepository bookDetailsRepository;

    @Autowired
    public BookDetailsController(BookDetailsRepository bookDetailsRepository){
        this.bookDetailsRepository = bookDetailsRepository;
    }

    @PostMapping("/add")
    public @ResponseBody BookDetails addBookDetails (@RequestBody BookDetails bookDetails){
        return bookDetailsRepository.save(bookDetails);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<BookDetails> getAll(){
        return bookDetailsRepository.findAll();
    }
}
