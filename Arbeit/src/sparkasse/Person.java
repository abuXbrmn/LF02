package sparkasse;

public class Person  {
    private String vorname;
    private String nachname;
    public Person(String vorname,String nachname){
        this.nachname=nachname;
        this.vorname=vorname;
    }

    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
    public void setNachname(String nachname) {
        this.nachname=nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    @Override
    public String toString(){
        String ausgabe ;
        ausgabe = "\t Vorname :"+vorname;
        ausgabe+="\t Nachname :"+nachname;
    return  ausgabe;
    }
}
