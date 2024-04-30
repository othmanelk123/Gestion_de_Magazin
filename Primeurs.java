package com.gestionstock;

public class Primeurs extends Articles implements VendableParKilogramme {
	double quantiteEnStock;

    public Primeurs(double prixAchat, double prixVente, String nom, String fournisseur) {
        super(prixAchat, prixVente, nom, fournisseur);
        this.quantiteEnStock = 0;
    }

    void remplirStock(double quantite) {
        quantiteEnStock += quantite;
    }
    public double depensesPrimeures(double prixAchat, double quantite) {
    	
    	this.prixAchat=prixAchat;
    	this.quantiteEnStock=quantite ;
   return prixAchat*quantite; }
    
    public double vendre(double quantite) {
        if (quantiteEnStock >= quantite) {
            quantiteEnStock -= quantite;
            return quantite * prixVente;
        } else {
            System.out.println("Stock insuffisant.");
            return 0;
        }
    }

    
    public void descriptionCaracteristiques() {
        super.descriptionCaracteristiques(); // Appelle la méthode de la classe parente
        super.calculerTauxRendement();
        System.out.println("Quantité en stock: " + quantiteEnStock);
    }

}
