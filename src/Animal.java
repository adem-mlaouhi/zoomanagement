public class Animal {
    String famille;
    String nom;
    int age;
    boolean estMammifere;
    public Animal(String famille, String nom, int age, boolean estMammifere) {
        this.famille = famille;
        this.nom = nom;
        this.age = age;
        this.estMammifere = estMammifere;
    }
    public void afficherAnimal() {
        System.out.println("Famille : " + famille);
        System.out.println("Nom : " + nom);
        System.out.println("Age : " + age);
        System.out.println("Mammifère : " + estMammifere);
    }
    @Override
    public String toString() {
        return "Famille : " + famille +
                ", Nom : " + nom +
                ", Age : " + age +
                ", Mammifère : " + estMammifere;
    }
}