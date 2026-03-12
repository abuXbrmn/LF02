package Tresor;

public class Aktie extends Kiste{
    String unternehmen;
    double nennWert;

    public Aktie(int id , double wert, String unternehmen,double nennWert){
        super (id,wert);
        this.unternehmen=unternehmen;
        this.nennWert=nennWert;
    }

    public String getUnternehmen() {
        return unternehmen;
    }

    public double getNennWert() {
        return nennWert;
    }
    @Override
    public String toString(){
        String ausgabe;
        ausgabe="\t"+unternehmen+"Unternehmen Name :";
        ausgabe+="\t"+nennWert+"Nennwert :";
        return ausgabe;
    }
}