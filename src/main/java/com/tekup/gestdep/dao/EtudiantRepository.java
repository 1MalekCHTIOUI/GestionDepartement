package com.tekup.gestdep.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.gestdep.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    
}