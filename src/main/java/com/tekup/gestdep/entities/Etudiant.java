package com.tekup.gestdep.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
@Entity
public class Etudiant  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String adresse;
    private String cin;
    private String dateNaissance;
    private String sexe;
    private String niveauEtude;
    public Etudiant(String nom, String prenom, String email, String telephone, String adresse, String cin,
            String dateNaissance, String sexe, String niveauEtude) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.adresse = adresse;
        this.cin = cin;
        this.dateNaissance = dateNaissance;
        this.sexe = sexe;
        this.niveauEtude = niveauEtude;
    } 

    
}
