package Horaire;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Horaire {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyyy");
    LocalDateTime horair;

    public Horaire(LocalDateTime horair) {
        this.horair=horair;
    }

    public LocalDateTime getHorair() {
        return horair;
    }

    public void setHorair(LocalDateTime horair) {
        this.horair = horair;
    }

    @Override
    public String toString() {
        return "horaire{" + "Date et heure ='" + horair + '}';
    }
}
