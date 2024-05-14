package fr.diginamic.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="livretA")
public class LivretA extends Compte {
	
	@Column(name="TAUX")
	private long taux;

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}

	public long getTaux() {
		return taux;
	}

	public void setTaux(long taux) {
		this.taux = taux;
	}
	
	
	

}
