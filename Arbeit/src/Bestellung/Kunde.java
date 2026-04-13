package Bestellung;

public class Kunde {
    String kundennummer ;
    Konto bankkonto;
    Adresse rechungsAdresse ;
    Adresse lieferAdresse;
    public Kunde(String kundennummer, Konto bankkonto, Adresse rechungsAdresse, Adresse lieferAdresse){
        this.kundennummer=kundennummer;
        this.bankkonto=bankkonto;
        this.rechungsAdresse=rechungsAdresse;
        this.lieferAdresse=lieferAdresse;
    }
}
