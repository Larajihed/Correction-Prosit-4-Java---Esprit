/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class TuniProdGestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
   ProduitAliementaire produit1 = new ProduitAliementaire();
	ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
	ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
	ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
	ProduitAliementaire produit44 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);

//        produit2.afficher();
//        
       // produit2.affecterPrix(0.7f);
//        
//        produit2.afficher();
//        
//        System.out.println( produit2.toString());
//        System.out.println(produit2);
//        
//        produit2.affecterDateExpiration(new Date(1377249026));
//        System.out.println(produit2.dateExpriration.toString());

//---------------------------------------
        Magasin m1 = new Magasin("Carrefour", "Centre-Ville");
        Magasin m2 = new Magasin("Monoprix", "Menzah6");
        
        Employee c1=new Caissier(1,"Caissier 1","Centre-Ville",5,1);
        Employee c2=new Caissier(2,"Caissier 2","Menzah 6",20,1);
        Employee V1=new Vendeur(1,"Vendeur 1","Centre-Ville",15,25214);
        Employee R1=new Responsable(1,"Responsable ","Centre-Ville",15,25214);
        
        m1.ajouterEmployee(c1);
        m1.ajouterEmployee(c2);
        m1.ajouterEmployee(V1);
        m1.ajouterEmployee(R1);
//        
//        m1.ajouterProduit(produit44);
//        m1.ajouterProduit(produit1);
//        m2.ajouterProduit(produit2);
//        m2.ajouterProduit(produit3);
        Employee V2=new Vendeur(1,"Vendeur 2","Centre-Ville",15,25214);
        Employee V3=new Vendeur(1,"Vendeur 3","Centre-Ville",15,25214);
        Employee V4=new Vendeur(1,"Vendeur 4","Centre-Ville",15,25214);
        Employee R2=new Responsable(1,"Responsable ","Centre-Ville",15,25214);
        
        m2.ajouterEmployee(V2);
        m2.ajouterEmployee(V3);
        m2.ajouterEmployee(V4);
        m2.ajouterEmployee(R2);
        
        System.out.println(V2.toString());
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        System.out.println(c1.calculerSalaire());
//        System.out.println(m1);
//
//        m1.ajouterProduit(produit1);
//        m1.ajouterProduit(produit2);
//        m1.ajouterProduit(produit3);
//        m1.ajouterProduit(produit4);
       // m1.ajouterProduit(produit44);
        
        
        
//        System.out.println(m1);
//        
//        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------

//        System.out.println(produit44.comparer(produit4));
//        
//        System.out.println(Magasin.comparer(produit4,produit2));
//        
        
//        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
//        System.out.println(m1);

    }

}
