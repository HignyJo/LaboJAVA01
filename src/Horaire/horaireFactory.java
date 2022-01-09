package Horaire;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class horaireFactory {

    public static List<Horaire> Ajouter() {

        List<Horaire> h = new ArrayList<>();
        boolean isValide = true;

        while (isValide) {
            String dateHeure;
            Scanner scanner = new Scanner(System.in);
            String choix = null;
            boolean c;

            System.out.println("Date et heure : (JJ-MMM-YYYY HH:mm) ");
            dateHeure = scanner.nextLine();

            LocalDateTime horair = LocalDateTime.parse(dateHeure, Horaire.formatter);

            h.add(new Horaire(horair));

            System.out.println("--------------------");
            System.out.println("|  horaire ajouté  |");
            System.out.println("--------------------");

            System.out.println("Voulez vous ajouter un autre horaire ? o/n");
            choix = scanner.nextLine();
            if(Objects.equals(choix, "n")) {
                isValide = false;
            }

        }
        return h;
    }
    
/*
    public static List<Horaire> afficher() {

    }

    public static List<Horaire> supprimer() {

    }
*/

}
