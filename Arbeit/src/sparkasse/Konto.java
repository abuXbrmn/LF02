package sparkasse;

public abstract class Konto {
    private Kunde inhaber;
    private double kontoStand;
    private double kriditLimit;
    private double zinsGuthaben;

    public Konto(Kunde inhaber, double kriditLimit, double zinsGuthaben) {
        this.inhaber = inhaber;
        this.kriditLimit = kriditLimit;
        this.zinsGuthaben = zinsGuthaben;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKriditLimit() {
        return kriditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }

    public void einzahlen(double betrag) throws BetragNichtKorrektException {
        if (betrag >= 0) {
            kontoStand = betrag + kontoStand;
        } else {
            throw new BetragNichtKorrektException(betrag);
        }
    }

    public void auszahlen(double betrag) throws KriditlimitUeberschrittenExcepotion, BetragNichtKorrektException {
        if (betrag<= 0) {
            throw new BetragNichtKorrektException(betrag);
        } else {
            if (kontoStand - betrag >= kriditLimit) {
                kontoStand = kontoStand - betrag;
            } else {
                throw new KriditlimitUeberschrittenExcepotion(betrag,kriditLimit);
            }
        }
    }


    public String toString() {
        String ausgabe = "\t\n Inhaber " + inhaber;
        ausgabe += "\t\n konto Stand :" + kontoStand;
        ausgabe += "\t\n kriditlimit " + kriditLimit;
        ausgabe += "\t\n Zinsguthaben :" + zinsGuthaben;
        return ausgabe;
    }
}
