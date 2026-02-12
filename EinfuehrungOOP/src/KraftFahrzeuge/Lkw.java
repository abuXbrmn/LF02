package KraftFahrzeuge;

public class Lkw  extends Kraftfahrzeuge {
    private int anzahlAchsen ;
    public Lkw( String marke , String model ,String farbe , int anzahlAchsen ,double wert){
        super(marke,model,farbe,anzahlAchsen,wert);
        this.anzahlAchsen=anzahlAchsen;
    }
    public int getanzahlAchsen(){
        return anzahlAchsen;
    }
    public void setAnzahlAchsen(int anzahlAchsen){
        this.anzahlAchsen=anzahlAchsen;
    }
    @Override
    public String toString(){
        String ausgabe = "\n\t Marke :"+getMarke();
        ausgabe +="\n\t Model :"+getModel();
        ausgabe +="\n\t Farbe :"+getFarbe();
        ausgabe +="\n\t Baujahr :"+getBaujahr();
        ausgabe +="\n\t Anzahl Achsen :"+getanzahlAchsen();
        ausgabe+= "\n\t wert :"+getWert();
        return ausgabe;
    }
}
