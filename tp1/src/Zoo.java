package entities;

public class Zoo {

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int nombreAnimaux = 0;

    public static final int MAX_ANIMAUX = 25;

    public Zoo(String name, String city, int nbrCages) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
            this.name = "Zoo sans nom";
        } else {
            this.name = name;
        }

        this.city = city;
        this.nbrCages = Math.min(nbrCages, MAX_ANIMAUX);
        this.animals = new Animal[MAX_ANIMAUX];
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            return false;
        }
        if (animal == null) {
            return false;
        }
        if (searchAnimal(animal.getName()) != -1) {
            return false;
        }

        animals[nombreAnimaux] = animal;
        nombreAnimaux++;
        return true;
    }

    public boolean isZooFull() {
        return nombreAnimaux >= nbrCages;
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nombreAnimaux; i++) {
            if (animals[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void displayAnimals() {
        if (nombreAnimaux == 0) {
            System.out.println("Le zoo ne contient aucun animal.");
            return;
        }
        for (int i = 0; i < nombreAnimaux; i++) {
            animals[i].displayAnimal();
            System.out.println();
        }
    }

    public boolean removeAnimal(Animal animal) {
        if (animal == null) return false;

        int index = searchAnimal(animal.getName());
        if (index == -1) {
            return false;
        }

        // Fixed syntax error here: 'nombreAnimaux - 1'
        for (int i = index; i < nombreAnimaux - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nombreAnimaux - 1] = null;
        nombreAnimaux--;
        return true;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
        System.out.println("Nombre d'animaux : " + nombreAnimaux);
    }

    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.nombreAnimaux >= zoo2.nombreAnimaux) {
            return zoo1;
        }
        return zoo2;
    }

    @Override
    public String toString() {
        return "Nom du zoo : " + name +
                ", Ville : " + city +
                ", Nombre de cages : " + nbrCages +
                ", Nombre d'animaux : " + nombreAnimaux;
    }
}