package com.tekup.gestdep.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.gestdep.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    
}