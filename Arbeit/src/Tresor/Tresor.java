package Tresor;

import java.util.ArrayList;

public class Tresor {
     ArrayList<Kiste> gegenstaende = new ArrayList<>();

    public Tresor(){
    }


    public Kiste getKiste(int id ) throws GegenStandNichtGefundenException{
        for (int i = 0; i < gegenstaende.size(); i++) {
            if (gegenstaende.get(i).getId()== id){
                return gegenstaende.get(i);
            }
        }
        throw new GegenStandNichtGefundenException(id);
    }


    public void addkiste(Kiste kiste ){
        gegenstaende.add(kiste);
    }
    public void removeKiste(Kiste kiste ){
        gegenstaende.remove(kiste);
    }

    public  double berechneGesamtWert(){
        double gesamtwert=0;
        for (Kiste WERT:gegenstaende){
            gesamtwert+=WERT.getWert();

        }
        return gesamtwert;
    }
    @Override
    public String toString(){
        String ausgabe ;
        ausgabe = toString();
        ausgabe+=" In der Kiste befindet sich ein Gesammt wert von "+"\n"+berechneGesamtWert();
        return ausgabe;
    }
}
