import Horaire.Horaire;
import Horaire.horaireFactory;

import java.util.List;
import java.util.Scanner;

public class GestionHoraires {

    static void menuHoraires() {

        int choix = -1;

        while (choix > 3 || choix < 0) {

            System.out.println("| Gestion des horaires |");
            System.out.println("---       Menu       ---");
            System.out.println("1. Afficher les horaires");
            System.out.println("2. Ajouter un horaire");
            System.out.println("3. Modifier un horaire");
            System.out.println("4. Supprimer un horaire");
            System.out.println("-----------------------------");
            System.out.println("0. RETOUR");
            System.out.println("-----------------------------");
            System.out.println("Votre choix : ");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1:

                    menuHoraires();
                    break;

                case 2:
                    List<Horaire> horaires = horaireFactory.Ajouter();
                    for(Horaire h  : horaires){
                        System.out.println(h);
                    }
                    menuHoraires();
                    break;

                case 3:

                    menuHoraires();
                    break;

                case 4:

                    menuHoraires();
                    break;

                case 0:
                    menuPrincipale.principaleMenu();
                    break;

                default:
                    System.out.println("Erreur lors du choix !");

            }
        }

    }

}
