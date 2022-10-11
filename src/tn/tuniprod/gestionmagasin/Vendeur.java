package tn.tuniprod.gestionmagasin;

public class Vendeur extends Employee{
	private  double tauxDeVente ;

	public Vendeur(int identifiant, String nom, String adress, int nbr_heures, double tauxDeVente) {
		super(identifiant, nom, adress, nbr_heures);
		this.tauxDeVente = tauxDeVente;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return 450*this.tauxDeVente;
	}
	
}
