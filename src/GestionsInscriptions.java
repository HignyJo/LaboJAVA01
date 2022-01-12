import Horaire.Horaire;
import Stagiaire.Stagiaire;
import Stagiaire.StagiaireFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionsInscriptions {

   static void menuInscription() {

        int choix = -1;

        List<Stagiaire> stagiaires = new ArrayList<>();

        while (choix > 3 || choix < 0) {

            System.out.println("| Gestion des inscriptions |");
            System.out.println("---         Menu         ---");
            System.out.println("1. Afficher les stagiaires");
            System.out.println("2. Ajouter un stagiaire");
            System.out.println("3. Modifier un stagiaire");
            System.out.println("4. Supprimer un stagiaire");
            System.out.println("-----------------------------");
            System.out.println("0. RETOUR");
            System.out.println("-----------------------------");
            System.out.println("Votre choix : ");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
        }

        if (choix == 1) {
            for (Stagiaire s : stagiaires) {
                System.out.println(s);
            }
        }

        if (choix == 2) {
            stagiaires = StagiaireFactory.Ajouter();
            for (Stagiaire s : stagiaires) {
                System.out.println(s);
            }
        }


    }
}


