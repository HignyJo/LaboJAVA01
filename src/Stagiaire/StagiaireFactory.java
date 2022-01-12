package Stagiaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StagiaireFactory {

    public static List<Stagiaire> Ajouter() {

        List<Stagiaire> s = new ArrayList<>();
        boolean isValide = true;

        while (isValide) {
            String nom;
            String prenom;
            String date;
            Scanner scanner = new Scanner(System.in);
            String choix = null;
            boolean c;

            System.out.println("Nom : ");
            nom = scanner.nextLine();
            System.out.println("Prenom : ");
            prenom = scanner.nextLine();
            System.out.println("Date de naissance : ( JJ-MMMM-YYYY)  ");
            date = scanner.nextLine();

            LocalDate birthDay = LocalDate.parse(date, Stagiaire.formatter);

            s.add(new Stagiaire(nom, prenom, birthDay));

            System.out.println("--------------------");
            System.out.println("| Stagiaire ajouté |");
            System.out.println("--------------------");

            System.out.println("Voulez vous ajouter un autre stagiaire ? o/n");
            choix = scanner.nextLine();
            if(Objects.equals(choix, "n")) {
                isValide = false;
            }

        }

        return s;
    }

    /*
    public static List<Stagiaire> afficher() {
    }


    public static List<Stagiaire> supprimer() {

    }
*/
}
