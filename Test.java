package com.gestionstock;

public class Test {
double gain ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gain ;

		// Création des articles
        ArticlesElectromenagers articleElectro1 = new ArticlesElectromenagers(100, 150, "Réfrigérateur", "ElectroSupplier");
        ArticlesElectromenagers articleElectro2 = new ArticlesElectromenagers(50, 80, "Aspirateur", "ElectroSupplier");

        Primeurs primeur1 = new Primeurs(1, 2, "Pommes", "FruitSupplier");
        Primeurs primeur2 = new Primeurs(0.5, 1, "Bananes", "FruitSupplier");

        // Création du magasin
        ArticlesElectromenagers[] electromenagers = {articleElectro1, articleElectro2};
        Primeurs[] primeurs = {primeur1, primeur2};
        Magasin magasin = new Magasin(electromenagers, primeurs);

        // Remplissage du stock
        articleElectro1.remplirStock(1000);
        articleElectro2.remplirStock(2000);

        primeur1.remplirStock(100);
        primeur2.remplirStock(200);

        // Simulation des achats
        magasin.revenus += articleElectro1.vendre(1000);
        magasin.revenus += articleElectro2.vendre(2000);

        magasin.revenus += primeur1.vendre(100);
        magasin.revenus += primeur2.vendre(200);
        
        magasin.depenses+=primeur1.depensesPrimeures(1, 100);
        magasin.depenses+=primeur2.depensesPrimeures(0.5, 200);
        magasin.depenses+=articleElectro1.depensesElectro(100, 1000);
        magasin.depenses+=articleElectro2.depensesElectro(50, 2000);

        
        // Affichage de l'état du magasin
        magasin.descriptionEtatMagasin();
        System.out.println("Taux de rendement: " + magasin.calculerTauxRendement() + "%");
        
         gain=magasin.revenus-magasin.depenses ;
         System.out.println("le gain de notre magazin est "+gain );
    }

	}


