package com.tekup.gestdep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tekup.gestdep.dao.EtudiantRepository;
import com.tekup.gestdep.entities.Etudiant;

@SpringBootApplication
public class GestdepApplication implements CommandLineRunner{

	@Autowired
	private EtudiantRepository etudiantRep;
	public static void main(String[] args) {
		SpringApplication.run(GestdepApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Etudiant etudiant1 = new Etudiant("John", "Doe", "john.doe@example.com", "123-456-7890", "123 Main St", "1234567890", "2000-01-01", "Male", "Bachelor");
		Etudiant etudiant2 = new Etudiant("Jane", "Smith", "jane.smith@example.com", "987-654-3210", "456 Elm St", "0987654321", "1999-02-15", "Female", "Master");
		Etudiant etudiant3 = new Etudiant("Robert", "Johnson", "robert.johnson@example.com", "555-123-4567", "789 Oak St", "5551234567", "1998-05-20", "Male", "Ph.D.");
		etudiantRep.save(etudiant1);
		etudiantRep.save(etudiant2);
		etudiantRep.save(etudiant3);
	}

}
