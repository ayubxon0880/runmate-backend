package uz.runmate.RunMate.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.runmate.RunMate.model.Specialist;
import uz.runmate.RunMate.repository.SpecialistRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpecialistService {
    private final SpecialistRepository specialistRepository;

    public List<Specialist> getAll() {
        return specialistRepository.findAll();
    }

    public Specialist create(Specialist specialist) {
        return specialistRepository.save(specialist);
    }
}
