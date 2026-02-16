import java.util.Random;

public class GamePlay {
    private static final  int Spielzeit = 90;
    private static final int NachspielZeit = 5;
    private static final int Aktion = 10;
private  static  int ermittelMannschaftWert( Mannschaft mannschaft){
    int ermittelMannnscgaftWert = mannschaft.getStaerke()* mannschaft.getMotivation()*mannschaft.getTrainer().getErfahrung();
    if (ermittelMannnscgaftWert<1){
        ermittelMannnscgaftWert=1;

    return  ermittelMannnscgaftWert;}
    return ermittelMannnscgaftWert;
}

private static boolean erzielteTor(Spieler schuetze, Torwart torwart) {
        Random r = new Random();
        // int torschussZufall = torschuss holen (über den Getter) + r.nextInt(5) - 2;
        // falls torschussZufall < 1 --> soll auf 1 gesetzt werden // z. B. Math.max(1, torschussZufall)
        int torschuszufall = schuetze.getTorschusse() + r.nextInt(5) - 2;
        torschuszufall = Math.max(1, torschuszufall);
        int reaktionModofizieren = torwart.getReaktion() + r.nextInt(5) - 2;
        reaktionModofizieren = Math.max(1, reaktionModofizieren);
        if (torschuszufall > reaktionModofizieren) {
            return true;
        }
        return false;
    }
public static void spielen(Spiel spiel){
    //Festlegung der Spieldauer

    Random r = new Random();
    int spieldauer = Spielzeit +r.nextInt(NachspielZeit) + 1;
    // spiel minute ermitelln
    int akkuelleMin =r.nextInt(Aktion)+1;
    int gesammtMannschaftWertH = ermittelMannschaftWert(spiel.getHeim());
    int gesammtMannschaftWertG= ermittelMannschaftWert(spiel.getGast());
    int addierenWerte = gesammtMannschaftWertG+gesammtMannschaftWertH;
    int zufallMannschaftH = r.nextInt(addierenWerte+1);
    int zufallmanschaftG = r.nextInt(addierenWerte+1);
    do {if (zufallMannschaftH<zufallmanschaftG){
        zufallMannschaftH=
    }



        akkuelleMin += r.nextInt(Aktion);
    }while(spieldauer > akkuelleMin);

}

}
