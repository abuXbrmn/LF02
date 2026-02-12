package Obst;

public class Apfel extends Obst {
 private String farbe ;
 public Apfel(int vitaminGehalt,double gewicht,boolean reife, String farbe){
     super(vitaminGehalt,gewicht,reife);
     this.farbe=farbe;

 }


    public String getfarbe(){
        return farbe;
    }
    public void setFarbe(String farbe){
        this.farbe= farbe;
    }
@Override
    public String toString() {
    String ausgabe = "Apfel" ;
    ausgabe += super.toString();
    ausgabe += "\n\tfarbe:" + this.getfarbe();
    return ausgabe;
 }
}
