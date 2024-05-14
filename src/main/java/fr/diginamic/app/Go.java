package fr.diginamic.app;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.diginamic.entites.Adresse;
import fr.diginamic.entites.AssuranceVie;
import fr.diginamic.entites.Banque;
import fr.diginamic.entites.Client;
import fr.diginamic.entites.Compte;
import fr.diginamic.entites.LivretA;
import fr.diginamic.entites.Operation;
import fr.diginamic.entites.Virement;

public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		Client clientA = new Client();
		Client clientB = new Client();
		Client clientC = new Client();

		Compte compte = new Compte();
		
		Set<Compte> comptesClientAB = new HashSet<>();
		comptesClientAB.add(compte);
		
		clientA.setComptes(comptesClientAB);
		
		tr.begin();
		em.persist(clientA);
		em.persist(clientB);
		tr.commit();
		
		em.close();
		
		/*Compte livretA = new LivretA();
		AssuranceVie assuranceVie = new AssuranceVie();
		Virement virement = new Virement();

		virement.setMotif("bla");

		Set<Operation> operations = new HashSet<>();
		operations.add(virement);

		
		livretA.setOperations(operations);

		Set<Compte> comptes = new HashSet<>();
		comptes.add(livretA);
		comptes.add(assuranceVie);

		client.setComptes(comptes);

		tr.begin();
		em.persist(client);
		em.persist(livretA);
		em.persist(assuranceVie);
		em.persist(virement);
		virement.setCompte(assuranceVie);
		tr.commit();
*/
		/*
		 * Banque banque1 = new Banque(); Banque banque2 = new Banque(); Client client1
		 * = new Client(); Client client2 = new Client(); Client client3 = new Client();
		 * Compte compte1 = new Compte(); Compte compte2 = new Compte(); Adresse
		 * adresse1 = new Adresse(); Adresse adresse2 = new Adresse(); Adresse adresse3
		 * = new Adresse();
		 * 
		 * banque1.setNom("BMP"); banque2.setNom("Caisse D'épargne");
		 * 
		 * adresse1.setCodePostal(31); adresse1.setCodePostal(32);
		 * adresse3.setNumero(51);
		 * 
		 * compte1.setNumero("1"); compte2.setNumero("2");
		 * 
		 * 
		 * Set<Compte> comptes1 = new HashSet<>(); comptes1.add(compte1);
		 * 
		 * client1.setAdresse(adresse1); client1.setBanque(banque1);
		 * client1.setComptes(comptes1); client1.setNom("Paul");
		 * client2.setAdresse(adresse2); client2.setBanque(banque1);
		 * client2.setComptes(comptes1); client2.setNom("Armand");
		 * client3.setAdresse(adresse3); client3.setBanque(banque2);
		 * client3.setNom("Claude");
		 * 
		 * 
		 * 
		 * tr.begin(); em.persist(compte2); em.persist(compte1); em.persist(banque1);
		 * em.persist(banque2); em.persist(client1); em.persist(client2);
		 * em.persist(client3);
		 * 
		 * tr.commit();
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
