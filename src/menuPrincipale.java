import java.util.Scanner;

public class menuPrincipale {

    static void principaleMenu() {

        int choix = -1;

        while (choix > 3 || choix < 0) {

            System.out.println("| Outil de gestion de stage |");
            System.out.println("---    Menu principale    ---");
            System.out.println("1. Gestion des horaires");
            System.out.println("2. Gestion des inscriptions");
            System.out.println("3. Gestion des activités");
            System.out.println("-----------------------------");
            System.out.println("0. QUITTER");
            System.out.println("-----------------------------");
            System.out.println("Votre choix : ");

            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    GestionHoraires.menuHoraires();
                    break;

                case 2:
                    GestionsInscriptions.menuInscription();
                    break;

                case 3:
                    GestionActivites.menuActivites();
                    break;

                case 0:
                    System.out.println("Vous avez décidé de quitter, au revoir !");
                    break;

                default:
                    System.out.println("Erreur lors du choix !");

            }
        }

    }
}
