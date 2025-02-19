package com.example.practitioner_service.repository;

import com.example.practitioner_service.model.Praticien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PraticienRepository extends JpaRepository<Praticien, Long> {
}
