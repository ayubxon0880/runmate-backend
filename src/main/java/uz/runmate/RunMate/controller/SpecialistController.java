package uz.runmate.RunMate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.runmate.RunMate.model.Specialist;
import uz.runmate.RunMate.service.SpecialistService;

import java.util.List;

@RestController
@RequestMapping("/api/specialists")
@RequiredArgsConstructor
public class SpecialistController {
    private final SpecialistService specialistService;

    @GetMapping
    public List<Specialist> getAll() {
        return specialistService.getAll();
    }

    @PostMapping
    public Specialist create(@RequestBody Specialist specialist) {
        return specialistService.create(specialist);
    }
}
