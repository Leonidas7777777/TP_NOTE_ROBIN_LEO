package com.example.practitioner_service.controller;

import com.example.practitioner_service.model.Praticien;
import com.example.practitioner_service.service.PraticienService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/praticiens")
@Tag(name = "Praticiens", description = "Gestion des praticiens")
public class PraticienController {
    @Autowired
    private PraticienService service;

    @GetMapping
    public List<Praticien> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Praticien> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Praticien create(@RequestBody Praticien praticien) {
        return service.save(praticien);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
