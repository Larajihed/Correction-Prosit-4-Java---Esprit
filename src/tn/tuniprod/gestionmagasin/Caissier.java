package tn.tuniprod.gestionmagasin;

public class Caissier extends Employee{
	private int numeroDeCaisse;
	private double salaire;

	public Caissier(int identifiant, String nom, String adress, int nbr_heures, int numeroDeCaisse) {
		super(identifiant, nom, adress, nbr_heures);
		this.numeroDeCaisse = numeroDeCaisse;
	}

	@Override
	public double calculerSalaire() {
			if (super.getNbr_heures()<=20)
			{
				return super.getNbr_heures()*5;
			}else {
				return super.getNbr_heures()*20+(super.getNbr_heures()-20)*(5*1.15);
}}
	
	}
