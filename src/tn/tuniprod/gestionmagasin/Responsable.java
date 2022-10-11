package tn.tuniprod.gestionmagasin;

public class Responsable extends Employee{
	private double Prime;

	public Responsable(int identifiant, String nom, String adress, int nbr_heures, double prime) {
		super(identifiant, nom, adress, nbr_heures);
		Prime = prime;
	}

	@Override
	public double calculerSalaire() {
		if(super.getNbr_heures()<=20) {
			return super.getNbr_heures()*10+Prime;
		}else {
			return 20*10+(super.getNbr_heures()-20)*(10*1.2);
		}

		
	}
	
}
