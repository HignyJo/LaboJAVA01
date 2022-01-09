package Activite;

public class Activite {
    String nom;

    public Activite(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Activite{" +
                "Nom de l'activité= '" + nom + '\'' +
                '}';
    }
}
