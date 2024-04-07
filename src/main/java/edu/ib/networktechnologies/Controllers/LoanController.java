package edu.ib.networktechnologies.Controllers;

import edu.ib.networktechnologies.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import edu.ib.networktechnologies.Entities.Loan;

@RestController
@RequestMapping("/loan")
public class LoanController {

    private LoanRepository loanRepository;

    @Autowired
    public LoanController(LoanRepository loanRepository){
        this.loanRepository = loanRepository;
    }

    @PostMapping("/add")
    public @ResponseBody Loan addLoan (@RequestBody Loan loan){
        return loanRepository.save(loan);
    }

    @GetMapping("/getAll")
    public @ResponseBody Iterable<Loan> getAll(){
        return loanRepository.findAll();
    }
}
