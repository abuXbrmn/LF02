package Bestellung;

public class Buch extends Artikel {
    String titel;

    public Buch(double preis,String titel) {
        super(preis);
        this.titel=titel;
    }
}
