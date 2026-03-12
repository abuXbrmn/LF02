package sparkasse;

public class BetragNichtKorrektException  extends Exception{

    private double betrag;

    public BetragNichtKorrektException(double betrag) {
        this.betrag=betrag;
    }

    @Override
    public String getMessage(){
        String getMessage= "Der Vorgang ist nicht möglich, da der Betrag in Höhe von "
                + betrag + " Euro als negativer Wert eingegeben wurde!";
        return  getMessage;
    }
}
