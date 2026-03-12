package sparkasse;

public class Adresse {
    private String strasse;
    private String hausNr;
    private String plz;
    private String ort;
    public Adresse(String strasse,String hausNr,String plz, String ort){

        this.strasse=strasse;
        this.hausNr=hausNr;
        this.plz=plz;
        this.ort=ort;
    }


    public String getStrasse(){
        return strasse;
    }

    public String getHausNr() {
        return hausNr;
    }
    public String getplz(){
        return plz;
    }
    public String getOrt(){
        return ort;
    }
    public void setStrasse(String strasse){
        this.strasse=strasse;
    }
    public void setHausNr(String hausNr) {
        this.hausNr = hausNr;
    }
    public void setPlz(String ort){
        this.ort=ort;
    }
    public void setplz(String plz){
        this.plz=plz;
    }
    @Override
    public String toString(){
        String ausgabe ;
        ausgabe = "\t Straße :"+strasse;
        ausgabe+= "\t  Haus Nummer :"+hausNr;
        ausgabe+="\t POstleitzahl :"+plz;
        ausgabe+= "\t Ort :"+ort;
    return ausgabe;
    }

}
