package com.gestionstock;

public class Magasin {
	double depenses;
    double revenus;
    ArticlesElectromenagers[] produitsElectromenagers;
    Primeurs[] produitsPrimeurs;

    public Magasin(ArticlesElectromenagers[] produitsElectromenagers, Primeurs[] produitsPrimeurs) {
        this.produitsElectromenagers = produitsElectromenagers;
        this.produitsPrimeurs = produitsPrimeurs;
        this.depenses = 0;
        this.revenus = 0;
    }

    void descriptionEtatMagasin() {
        System.out.println("Dépenses: " + depenses);
        System.out.println("Revenus: " + revenus);
    }

    double calculerTauxRendement() {
        double totalAchat = 0;
        double totalVente = 0;

        for (ArticlesElectromenagers article : produitsElectromenagers) {
            totalAchat += article.prixAchat;
            totalVente += article.prixVente;
        }

        for (Primeurs primeur : produitsPrimeurs) {
            totalAchat += primeur.prixAchat;
            totalVente += primeur.prixVente;
        }

        return (totalVente - totalAchat) / totalAchat * 100;
    }
}


