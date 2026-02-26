public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbericht;

public Spiel(Mannschaft heim,Mannschaft gast){
    this.heim=heim;
    this.gast=gast;
    this.ergebnis = new Ergebnis();
    this.spielbericht=  new StringBuilder();
}

    public Mannschaft getGast() {
        return gast;
    }
    public Mannschaft getHeim(){
    return heim;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }
    @Override
    public String toString(){
    String ausgabe = "\n\n Heim-Manschaft :"+ heim;
    ausgabe+="\n\n Gast-Manschaft :"+ gast;
    ausgabe+="\n\n Spiel Bericht: \n" + spielbericht;
    return ausgabe;
    }
}

