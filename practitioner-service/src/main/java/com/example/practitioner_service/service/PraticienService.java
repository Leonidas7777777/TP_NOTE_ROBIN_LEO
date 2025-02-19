package com.example.practitioner_service.service;

import com.example.practitioner_service.model.Praticien;
import com.example.practitioner_service.repository.PraticienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PraticienService {
    @Autowired
    private PraticienRepository repository;

    public List<Praticien> getAll() {
        return repository.findAll();
    }

    public Optional<Praticien> getById(Long id) {
        return repository.findById(id);
    }

    public Praticien save(Praticien praticien) {
        return repository.save(praticien);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
