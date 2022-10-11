/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Magasin {

    int identifiant;
    String adresse;
    int capacite;
    String Nom;
    ProduitAliementaire[] produits;
    Employee[] employes ;
    int capaciteEmployee;


    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new ProduitAliementaire[50];
        this.employes= new Employee[20];
    }
	public void ajouterEmployee(Employee e) {
		this.employes[capaciteEmployee] = e;
		this.capacite++;
        
	}
	
    public Magasin(String Nom, String adresse) {
    	this.Nom=Nom;
    	this.adresse=adresse;
        this.produits = new ProduitAliementaire[50];
    	 this.employes= new Employee[20];
    }

  

    @Override
	public String toString() {
		return "Magasin [identifiant=" + identifiant + ", adresse=" + adresse + ", capacite=" + capacite + ", Nom="
				+ Nom + ", produits=" + Arrays.toString(produits) + ", employes=" + Arrays.toString(employes)
				+ ", capaciteEmployee=" + capaciteEmployee + "]";
	}
	public void ajouterProduit(ProduitAliementaire produit) {
        if (this.chercher(produit)) {
            System.out.println("Produit existant");
        } else {
            this.produits[capacite] = produit;
            this.capacite++;
        }
    }
    
    public int getIndexOfProduit(ProduitAliementaire produit){
        for(int i=0;i<this.capacite;i++){
            if(this.produits[i].comparer(produit)){
                return i;
            }
        }
        return -1;
    }
    
    public void supprimerProduit(ProduitAliementaire produit){
        int indexProduit = this.getIndexOfProduit(produit);
        if(indexProduit==-1){
            System.out.println("impossible de supprimer un produit qui n'existe pas dans le magasin");
        }
        else{
            for(int i=indexProduit;i<capacite;i++){
                this.produits[i]=this.produits[i+1];
                this.produits[capacite]=null;
                this.capacite--;
            }
        }
    }

    public int getTotalProduits() {
        return this.capacite;
    }

    public static boolean comparer(ProduitAliementaire produit, ProduitAliementaire produit2) {
        return produit2.getIdentifiant() == produit.getIdentifiant()
                && produit2.getPrix() == produit.getPrix()
                && produit2.getLibelle() == produit.getLibelle();
    }

    public boolean chercher(ProduitAliementaire produit) {
        for (int i = 0; i < this.capacite; i++) {
            if (this.produits[i].comparer(produit)) {
                return true;
            }
        }
        return false;
    }
    
    public  Magasin comparer(Magasin m){
        if(this.capacite>=m.capacite){
            return this;
        }
        else{
            return m;
        }
    }

}
