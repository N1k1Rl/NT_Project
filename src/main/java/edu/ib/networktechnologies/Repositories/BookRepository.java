package edu.ib.networktechnologies.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
}
