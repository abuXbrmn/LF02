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
        ausgabe = "AKTIE"+"\n";
        ausgabe+="Unternehmen Name :"+"\t"+unternehmen;
        ausgabe+="\t"+"Nennwert :"+"\t"+nennWert;
        return ausgabe;
    }
}