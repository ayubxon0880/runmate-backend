package uz.runmate.RunMate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.runmate.RunMate.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
