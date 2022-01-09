import Activite.Activite;
import Activite.ActiviteFactory;

import java.util.List;
import java.util.Scanner;

public class GestionActivites {

    static void menuActivites() {

        int choix = -1;

        while (choix > 3 || choix < 0) {

            System.out.println("| Gestion des activités |");
            System.out.println("---         Menu         ---");
            System.out.println("1. Afficher les activités");
            System.out.println("2. Ajouter une activité");
            System.out.println("3. Modifier une activité");
            System.out.println("4. Supprimer une activité");
            System.out.println("-----------------------------");
            System.out.println("0. RETOUR");
            System.out.println("-----------------------------");
            System.out.println("Votre choix : ");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1:

                    menuActivites();
                    break;

                case 2:
                    List<Activite> activites = ActiviteFactory.Ajouter();

                    for(Activite a  : activites){
                        System.out.println(a);
                    }

                    menuActivites();
                    break;

                case 3:

                    menuActivites();
                    break;

                case 4:

                    menuActivites();
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
