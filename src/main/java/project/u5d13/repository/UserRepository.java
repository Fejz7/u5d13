package project.u5d13.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d13.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
