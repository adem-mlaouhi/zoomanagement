package entities;

public class Animal {

    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        if (age < 0) {
            System.out.println("Erreur : l'âge ne peut pas être négatif.");
            this.age = 0;
        } else {
            this.age = age;
        }

        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void displayAnimal() {
        System.out.println("Famille : " + family);
        System.out.println("Nom : " + name);
        System.out.println("Age : " + age);
        System.out.println("Mammifère : " + isMammal);
    }

    @Override
    public String toString() {
        return "Famille : " + family +
                ", Nom : " + name +
                ", Age : " + age +
                ", Mammifère : " + isMammal;
    }
}