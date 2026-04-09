package Tresor;

public class Kiste {
    int Id;
    double wert;
    public Kiste ( int id, double wert ){
        this.Id=id;
        this.wert=wert;
    }

    public double getWert() {
        return wert;
    }

    public int getId() {
        return Id;
    }
    public void setWert(double wert) {
        this.wert = wert;
    }
    @Override
    public String toString(){
        String ausgabe;
        ausgabe = "\n"+"ID:"+"\t"+getId();
        ausgabe+="\n"+"Wert:"+getWert();
        return ausgabe;
    }
}
