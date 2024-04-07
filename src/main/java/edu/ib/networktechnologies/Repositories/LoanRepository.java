package edu.ib.networktechnologies.Repositories;

import edu.ib.networktechnologies.Entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
