package Obst;

public class Obst {
    private int vitaminGehalt;
    private double gewicht;
    private boolean reife ;

    public Obst (int vitaminGehalt,double gewicht,boolean reife){
       this.vitaminGehalt= vitaminGehalt;
       this.gewicht=gewicht;
       this.reife=reife;
    }

    public int getVitaminGehalt(){
        return vitaminGehalt;
    }

    public double getGewicht(){
        return gewicht;
    }

    public void setGewicht(double gewicht){
        this.gewicht=gewicht;
    }

    public  boolean isReif (){
        return reife;
    }

    public void setReife(boolean reife){
        this.reife=reife;
    }

    @Override
    public String toString(){
        String ausgabe = "\n\tVitamingehalt:"+ getVitaminGehalt();
        ausgabe+="\n\tGewicht"+getGewicht();
        ausgabe+="\n\tReif:"+isReif();
        return ausgabe;
    }

}
