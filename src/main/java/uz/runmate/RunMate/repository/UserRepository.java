package uz.runmate.RunMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.runmate.RunMate.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByPhone(String email);
}

