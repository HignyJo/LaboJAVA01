package Activite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ActiviteFactory {

    public static List<Activite> Ajouter() {

        List<Activite> a = new ArrayList<>();
        boolean isValide = true;

        while (isValide) {
            String nom;
            Scanner scanner = new Scanner(System.in);
            String choix = null;
            boolean c;

            System.out.println("Nom de l'activite : ");
            nom = scanner.nextLine();

            a.add(new Activite(nom));

            System.out.println("--------------------");
            System.out.println("| Activité ajouté |");
            System.out.println("--------------------");

            System.out.println("Voulez vous ajouter une autre activité ? o/n");
            choix = scanner.nextLine();
            if(Objects.equals(choix, "n")) {
                isValide = false;
            }


        }
        return a;
    }

/*
    public static List<Horaire> afficher() {

    }

    public static List<Horaire> supprimer() {

    }
*/

}
