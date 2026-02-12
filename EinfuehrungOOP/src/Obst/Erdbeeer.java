package Obst;

public class Erdbeeer extends Obst{
    private String geschmack;

    public Erdbeeer(int vitaminGehalt,double gewicht,boolean reife, String geschmack){
        super(vitaminGehalt, gewicht, reife);
        this.geschmack = geschmack;
    }

    public String getGeschmackt() {
        return geschmack;
    }

    public void setGeschmackt(String geschmack) {
        this.geschmack = geschmack;
    }

    @Override
    public String toString() {
        String ausgabe = "Erdbeere:";
        ausgabe = ausgabe + "\n\tVitamingehalt:" + getVitaminGehalt();
        ausgabe += "\n\tGewicht" + getGewicht();
        ausgabe += "\n\tReif:" + isReif();
        ausgabe+= "\n\tGeschmack :"+geschmack;
        return ausgabe;
    }

}
