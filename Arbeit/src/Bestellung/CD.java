package Bestellung;

public class CD extends Artikel{

    String Interpret ;
    public CD(double preis,String interpret) {
        super(preis);
        this.Interpret=interpret;
    }
}
