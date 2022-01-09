package Stagiaire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Stagiaire {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy");
    String nom;
    String prenom;
    LocalDate birthDay;

    public Stagiaire(String nom, String prenom, LocalDate birthDay) {
        this.nom = nom;
        this.prenom = prenom;
        this.birthDay = birthDay;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Stagiaire{" +
                "Nom='" + nom + '\'' +
                ", Prenom='" + prenom + '\'' +
                ", Date de naissance=" + birthDay +
                '}';
    }
}