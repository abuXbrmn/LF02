package Fussbal;

import java.util.ArrayList;

public class Mannschaft {
    private String Name ;
    private  Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> kader;

    public Mannschaft( String name,Trainer trainer,Torwart torwart,ArrayList<Spieler>kadar){
        this.Name= name;
        this.trainer=trainer;
        this.torwart=torwart;
        this.kader =kadar;
    }

    /** getMotivation mit Zählerschleife:
    public  int getMotivation(){
        int motivation = 0;
        for (int i = 0; i < kadar.size(); i++) {
            motivation = motivation + kadar.get(i).getMotivation();
            // oder so: motivation += kadar.get(i).getMotivation();
        }
        motivation = motivation + torwart.getMotivation();
        motivation = motivation / (kadar.size() + 1);
        return motivation;
    }
    */

    //alternative Möglichkeit: getMotivation mit forEach-Schleife
    public  int getMotivation(){
        int motivation = 0;
        for (Spieler s : kader) {
            motivation = motivation + s.getMotivation();
            // oder so: motivation += s.getMotivation();
        }
        motivation = motivation + torwart.getMotivation();
        motivation = motivation / (kader.size() + 1);
        return motivation;
    }



    public int getStaerke(){
        int staerke = 0;
        for (int i = 0; i < kader.size(); i++) {
            staerke= staerke+ kader.get(i).getStaerke();

        }
    staerke =staerke+torwart.getStaerke();
        staerke=staerke/ kader.size()+1;
        return staerke;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setKader(ArrayList<Spieler> kader) {
        kader = kader;
    }

    public ArrayList<Spieler> getKader() {
        return kader;
    }
@Override
    public String toString(){
        String ausgabe ="\n Name "+getName();
        ausgabe+="\n\n Fussbal.Trainer "+getTrainer();
        ausgabe+="\n\n Torwart "+getTorwart();
        ausgabe += "\n\n Fussbal.Spieler: ";
        ausgabe+=" \n "+getKader();
        return  ausgabe;
    }
}
