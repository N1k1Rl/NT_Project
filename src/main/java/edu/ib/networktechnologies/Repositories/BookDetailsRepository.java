package edu.ib.networktechnologies.Repositories;


import edu.ib.networktechnologies.Entities.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDetailsRepository extends JpaRepository<BookDetails, Long> {
}
