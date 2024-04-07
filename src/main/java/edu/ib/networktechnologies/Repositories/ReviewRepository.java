package edu.ib.networktechnologies.Repositories;

import edu.ib.networktechnologies.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
