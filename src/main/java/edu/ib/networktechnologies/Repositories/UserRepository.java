package edu.ib.networktechnologies.Repositories;

import edu.ib.networktechnologies.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
