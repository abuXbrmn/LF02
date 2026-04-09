package Tresor;

public class Schmuck extends Kiste{
    String bezeichnung ;


    public Schmuck(int id, double wert,String bezeichnung) {
        super(id, wert);
        this.bezeichnung=bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    @Override
    public String toString(){
        String ausgabe ;
        ausgabe =" SCHMUCK"+"\n";
        ausgabe += super.toString();
        ausgabe +="\t"+"Bezeichnung"+"\t"+bezeichnung ;
        return  ausgabe;
    }
}

