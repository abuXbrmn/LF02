package Fussbal;

public class Spieler extends Person {

    private int staerke;
    private int torschusse;
    private int motivation;
    public Spieler(String name,int alter,int staerke,int torschusse,int motivation, int tore){
        super(name, alter);

        this.staerke= staerke;
        this.torschusse=torschusse;
        this.motivation=motivation;
    }
    public int getStaerke(){
        return staerke;

    }
    public void setStaerke(int staerke){
        this.staerke=staerke;
    }
    public int getTorschusse(){
        return torschusse;
    }

    public void setTorschusse(int torschusse) {
        this.torschusse = torschusse;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {

         String ausgabe = "\n"+ "\t|" + super.toString();
        ausgabe += "\n Stärke "+ "\t\t|" + staerke;
        ausgabe += "\n Tore Erzielt "+  "\t|" + torschusse;
        ausgabe += "\n Motivation " +  "\t|"  +motivation;
        return ausgabe;

    }

    public void addTor() {
        torschusse++;
    }
}
