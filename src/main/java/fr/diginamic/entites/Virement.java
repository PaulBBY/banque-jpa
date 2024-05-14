package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="virement")
public class Virement extends Operation{
	
	@Column(name="BENEFICIAIRE")
	private String beneficiaire;

	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}

	public String getBeneficiaire() {
		return beneficiaire;
	}

	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	
	
	

}
