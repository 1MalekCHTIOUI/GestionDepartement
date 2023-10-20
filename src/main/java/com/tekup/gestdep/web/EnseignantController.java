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

import com.tekup.gestdep.dao.EnseignantRepository;
import com.tekup.gestdep.entities.Enseignant;

import java.util.List;


@RestController
@RequestMapping("/enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantRepository enseignantRep;

    @PostMapping
    public Enseignant createEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantRep.save(enseignant);
    }

    @GetMapping
    public List<Enseignant> getAllEnseignants() {
        return enseignantRep.findAll();
    }

    @GetMapping("/{id}")
    public Enseignant getEnseignantById(@PathVariable Long id) {
        return enseignantRep.findById(id).get();
    }

    @PutMapping("/{id}")
    public Enseignant updateEnseignant(@PathVariable Long id, @RequestBody Enseignant enseignant) {
        enseignant.setId(id);
        return enseignantRep.save(enseignant);
    }

    @DeleteMapping("/{id}")
    public void deleteEnseignant(@PathVariable Long id) {
        enseignantRep.deleteById(id);
    }
}