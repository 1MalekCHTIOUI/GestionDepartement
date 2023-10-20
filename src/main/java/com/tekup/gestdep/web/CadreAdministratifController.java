package com.tekup.gestdep.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.gestdep.dao.CadreAdministratifRepository;
import com.tekup.gestdep.entities.CadreAdministratif;

@RestController
@RequestMapping("/cadresadmin")
public class CadreAdministratifController {

    @Autowired
    private CadreAdministratifRepository cadreAdminRep;

    @PostMapping
    public CadreAdministratif addCadreAdministratif(@RequestBody CadreAdministratif cadreAdmin) {
        return cadreAdminRep.save(cadreAdmin);
    }

    @GetMapping
    public List<CadreAdministratif> getCadresAdministratif() {
        return cadreAdminRep.findAll();
    }

    @GetMapping("/{id}")
    public CadreAdministratif getCadreAdministratif(@PathVariable("id") Long id) {
        return cadreAdminRep.findById(id).get();
    }

    @PutMapping("/{id}")
    public CadreAdministratif updateCadreAdministratif(@PathVariable("id") Long id, @RequestBody CadreAdministratif cadreAdmin) {
        cadreAdmin.setId(id);
        return cadreAdminRep.save(cadreAdmin);
    }
    
    @DeleteMapping("/{id}")
    public void deleteCadreAdministratif(@PathVariable("id") Long id) {
        cadreAdminRep.deleteById(id);
    }
}