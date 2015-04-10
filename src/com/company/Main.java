package com.company;

import Models.BonDeReduction;
import Models.Pourcentage;
import Models.Prix;

public class Main {

    public static void main(String[] args)
    {
	    Prix prix = new Prix(120);
        prix.Afficher();

        Pourcentage promo = new Pourcentage(prix, 12);
        prix.Calculer(promo);
        prix.Afficher();

        BonDeReduction bon = new BonDeReduction(50);
        prix.Calculer(bon);
        prix.Afficher();

        Prix p2 = new Prix(120);
        p2.Afficher();
        BonDeReduction bon1 = new BonDeReduction(50);
        p2.Afficher();
        Pourcentage pour = new Pourcentage(p2, 12);
        p2.Calculer(pour);
        p2.Afficher();
    }
}
