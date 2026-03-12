package sparkasse;

public class Mitarbeiter extends Person {

    public Mitarbeiter(String vorname,String nachname){
        super(vorname,nachname);
    }
@Override
    public String toString(){
        String ausgabe= "\t\n"+super.toString();
    return ausgabe;
    }
}
