package com.gestionstock;

public class ArticlesElectromenagers extends Articles implements VendableParPiece, SusceptibleDetreVenduEnSolde {
	int stock;

    public ArticlesElectromenagers(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.stock = 0;
    }

    void remplirStock(int quantite) {
        stock += quantite;
    }
public double depensesElectro(double prixAchat, int stock) {
    	
    	this.prixAchat=prixAchat;
    	this.stock=stock;
   return prixAchat*stock; 
   }
 
    public double vendre(int quantite) {
        if (stock >= quantite) {
            stock -= quantite;
            return quantite * prixVente;
        } else {
            System.out.println("Stock insuffisant.");
            return 0;
        }
    }
 // Méthode lancerSolde (implémentation de l'interface  
     
    public void lancerSolde(double pourcentage) {
        prixVente *= (1 - pourcentage / 100);
    }

    // Méthode terminerSolde (implémentation de l'interface  
     
    public void terminerSolde(double pourcentage) {
        prixVente /= (1 - pourcentage / 100);
    }

   
    public void descriptionCaracteristiques() {
        super.descriptionCaracteristiques();
        super.calculerTauxRendement() ;
        System.out.println("Stock: " + stock);
    }

}
