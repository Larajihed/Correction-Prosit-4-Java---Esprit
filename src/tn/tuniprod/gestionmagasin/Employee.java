package tn.tuniprod.gestionmagasin;

abstract public class Employee {
	private int Identifiant;
	private String Nom;
	private String Adress;
	private int nbr_heures;
	
	abstract public double calculerSalaire();
	
	public Employee(int identifiant, String nom, String adress, int nbr_heures) {
		this.Identifiant = identifiant;
		this.Nom = nom;
		this.Adress = adress;
		this.nbr_heures = nbr_heures;
        

	}

	public int getIdentifiant() {
		return Identifiant;
	}
	@Override
	public String toString() {
		return "Employee [Identifiant=" + Identifiant + ", Nom=" + Nom + ", Adress=" + Adress + ", nbr_heures="
				+ nbr_heures + "]";
	}

	public void setIdentifiant(int identifiant) {
		Identifiant = identifiant;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public int getNbr_heures() {
		return nbr_heures;
	}
	public void setNbr_heures(int nbr_heures) {
		this.nbr_heures = nbr_heures;
	}
	
}
