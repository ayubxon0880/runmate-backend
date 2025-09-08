package uz.runmate.RunMate.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.runmate.RunMate.model.Specialist;

public interface SpecialistRepository extends JpaRepository<Specialist, Long> {
}

