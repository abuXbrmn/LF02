package Bestellung;

public abstract class Artikel {
    Double preis;
    public Artikel(double preis){
        this.preis=preis;
    }

    public Double getPreis() {
        return preis;
    }
}
