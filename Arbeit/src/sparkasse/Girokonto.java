package sparkasse;

public class Girokonto extends Konto {

    private double zinsKredit;

  public Girokonto(Kunde inhaber, double kreditlimit, double zinsGuthaben, double zinsKredit){
      super(inhaber, kreditlimit, zinsGuthaben);
      this.zinsKredit = zinsKredit;
  }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public void ueberweissung(double betrag,Girokonto giroKonto) throws KriditlimitUeberschrittenExcepotion, BetragNichtKorrektException {
      auszahlen(betrag);
      giroKonto.einzahlen(betrag);
    }
    @Override
    public String toString(){
      String ausgabe = super.toString();
      ausgabe +=  "\t zins kridit "+zinsKredit;
      return ausgabe;
    }
}
