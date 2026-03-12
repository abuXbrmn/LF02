package Fussbal;

import java.util.Random;

public class GamePlay {
    private static final int SPIELZEIT = 90;
    private static final int NachspielZeit = 5;
    private static final int Aktion = 10;
     private static  final Random random = new Random();
    private static int ermittelMannschaftWert(Mannschaft mannschaft) {
        Random r = new Random();
        int ermittelMannnscgaftWert = mannschaft.getStaerke() * mannschaft.getMotivation() * mannschaft.getTrainer().getErfahrung() + r.nextInt(7) - 3;
        ermittelMannnscgaftWert = Math.max(1, ermittelMannnscgaftWert);
        if (ermittelMannnscgaftWert < 1) {
            ermittelMannnscgaftWert = 1;
        }
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


    private static boolean brechSpielab() {

        int abbruch = random.nextInt(5);
        return abbruch == 0;
    }

    public static void spielen(Spiel spiel) throws  SpielAbruchException {

        //Festlegung der Spieldauer

        Random r = new Random();
        Mannschaft offensiv;
        Mannschaft defensiv;
        int spieldauer = SPIELZEIT + random.nextInt(NachspielZeit + 1);
        // spiel minute ermitelln
        int akkuelleMin = random.nextInt(Aktion) + 1;
        akkuelleMin += random.nextInt(Aktion);
        do {

            int gesammtMannschaftWertH = ermittelMannschaftWert(spiel.getHeim());
            int gesammtMannschaftWertG = ermittelMannschaftWert(spiel.getGast());
            int addierenWerte = gesammtMannschaftWertG + gesammtMannschaftWertH;

            if (brechSpielab()){
                throw new SpielAbruchException(akkuelleMin);
            }

            long zufall = random.nextInt(Math.round(addierenWerte));
            int zufallMannschaftH = r.nextInt(addierenWerte + 1);
            int zufallmanschaftG = r.nextInt(addierenWerte + 1);

            if (zufall < gesammtMannschaftWertG) {
                offensiv = spiel.getGast();
                defensiv = spiel.getHeim();
            } else {
                offensiv = spiel.getHeim();
                defensiv = spiel.getGast();
            }



            int schuetzeNr = random.nextInt(offensiv.getKader().size());
            Spieler schuetze = offensiv.getKader().get(schuetzeNr);
            boolean getroffen = erzielteTor(schuetze, defensiv.getTorwart());
            if (getroffen) {
                offensiv.getKader().get(schuetzeNr).addTor();
                if (offensiv == spiel.getHeim()) {
                    spiel.getErgebnis().addToreHeim();
                } else
                    spiel.getErgebnis().addToregast();

                spiel.getSpielbericht().append(akkuelleMin + " Tor von " + offensiv.getKader().get(schuetzeNr).getName() + "\n");

                // zuflällige spiel minute festlegen für nächste aktion //
            } else {
                spiel.getSpielbericht().append(akkuelleMin + " : schuss von " + offensiv.getKader().get(schuetzeNr).getName() + "gehalten.\n");
            }
            akkuelleMin = akkuelleMin + random.nextInt(Aktion + 1);


        } while (spieldauer > akkuelleMin);
        spiel.getSpielbericht().append(spiel.getErgebnis());
    }
}


