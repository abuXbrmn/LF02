package rollenspiel;

import java.util.ArrayList;
import java.util.List;

public class wald {
    private List<Charaktere> spielCharaktereListe;

    public wald() {
        spielCharaktereListe = new ArrayList<Charaktere>();
    }

    public Charaktere getCharaktere(String name) throws SpielfigurNichtGefundenException {
        for (Charaktere charaktere : spielCharaktereListe) {
            if (charaktere.getName().equals(name)) {
                return charaktere;
            }
        }
        throw new SpielfigurNichtGefundenException(name);
    }

    public void addSpielfigur(Charaktere spielfigur) {
        spielCharaktereListe.add(spielfigur);
    }

    public void removeSpielfigur(Charaktere spielfigur) {
        spielCharaktereListe.remove(spielfigur);
    }


    private double ermittelGesamtStaerke() {
        double summe = 0;

        for (Charaktere spielfigur : spielCharaktereListe) {
            summe = summe + spielfigur.getStaerkepunkte();
        }
        return summe;
    }

    @Override
    public String toString() {
        StringBuilder text = new StringBuilder("spielfigur in rollenspiel.wald :\n");
        for (Charaktere spielfigur : spielCharaktereListe) {
            text.append("\t" + ermittelGesamtStaerke());
        }
        return text.toString();
    }
}
