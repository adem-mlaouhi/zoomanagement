public class Zoo {
    Animal[] animaux;
    String nom;
    String ville;
    int nbrCages;
    public Zoo(String nom, String ville, int nbrCages) {
        this.nom = nom;
        this.ville = ville;
        this.nbrCages = nbrCages;
        this.animaux = new Animal[25];
    }

    public void afficherZoo() {
        System.out.println("Nom du zoo : " + nom);
        System.out.println("Ville : " + ville);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    @Override
    public String toString() {
        return "Nom du zoo : " + nom +
                ", Ville : " + ville +
                ", Nombre de cages : " + nbrCages;
    }
}