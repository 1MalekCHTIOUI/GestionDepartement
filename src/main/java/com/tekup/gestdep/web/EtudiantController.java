package com.tekup.gestdep.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.gestdep.dao.EtudiantRepository;
import com.tekup.gestdep.entities.Etudiant;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    
    @Autowired
    private EtudiantRepository etudiantRep;

    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantRep.save(etudiant);
    }

    @GetMapping
    public List<Etudiant> getEtudiants() {
        return etudiantRep.findAll();
    }

    @GetMapping("/{id}")
    public Etudiant getEtudiant(@PathVariable Long id) {
        return etudiantRep.findById(id).get();
    }

    @PutMapping("/{id}")
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant, @PathVariable Long id) {
        etudiant.setId(id);
        return etudiantRep.save(etudiant);
    }

    @DeleteMapping("/{id}")
    public void deleteEtudiant(@PathVariable Long id) {
        etudiantRep.deleteById(id);
    }
}
