import java.util.Scanner;
import entities.Animal;
import entities.Zoo;

public class ZooManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // =========================
        // PROSIT 1
        // =========================

        int nbrCages = 20;
        String nomZoo = "mon zoo";

        // Saisie du nom du zoo
        do {
            System.out.print("Entrez le nom du zoo : ");
            nomZoo = scanner.nextLine();

            if (nomZoo.trim().isEmpty()) {
                System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            }
        } while (nomZoo.trim().isEmpty());

        // Saisie du nombre de cages
        do {
            System.out.print("Entrez le nombre de cages : ");

            while (!scanner.hasNextInt()) {
                System.out.println("Erreur : veuillez entrer un entier.");
                scanner.next();
                System.out.print("Entrez le nombre de cages : ");
            }

            nbrCages = scanner.nextInt();

            if (nbrCages <= 0) {
                System.out.println("Erreur : le nombre de cages doit être positif.");
            }
        } while (nbrCages <= 0);

        // =========================
        // PROSIT 2
        // =========================

        // Création du zoo
        Zoo monZoo = new Zoo(nomZoo, "Tunis", nbrCages);

        // Création des animaux
        Animal lion = new Animal("Félidés", "Lion", 5, true);
        Animal tigre = new Animal("Félidés", "Tigre", 4, true);
        Animal aigle = new Animal("Accipitridae", "Aigle", 3, false);

        // Ajout des animaux dans le zoo
        monZoo.addAnimal(lion);
        monZoo.addAnimal(tigre);
        monZoo.addAnimal(aigle);

        // =========================
        // AFFICHAGE DU ZOO
        // =========================

        System.out.println("\n======================");
        System.out.println("        MON ZOO");
        System.out.println("======================");

        monZoo.displayZoo();

        // =========================
        // AFFICHAGE DES ANIMAUX
        // =========================

        System.out.println("\n======================");
        System.out.println("       ANIMAUX");
        System.out.println("======================");

        lion.displayAnimal();
        System.out.println();

        tigre.displayAnimal();
        System.out.println();

        aigle.displayAnimal();

        // =========================
        // TEST DE toString()
        // =========================

        System.out.println("\n======================");
        System.out.println("       toString()");
        System.out.println("======================");

        System.out.println(monZoo);
        System.out.println(lion);

        scanner.close();
    }
}