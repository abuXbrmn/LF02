import java.util.ArrayList;

public class ProgrammFussballSpiel {
    public static void main(String[] args) {
        Trainer trainer1= new Trainer("melissa ",12,15);
        Torwart torwart1= new Torwart("zohra ",5,9,1,9);
        Spieler spieler1 =new Spieler("guli ",2,9,9,9,2);
        Spieler spieler2=  new Spieler("Mina ",4,9,8,7,52);
        Spieler spieler3 =new Spieler("setareh ",15,4,6,3,10);
        Spieler spieler4 =new Spieler(" bibigol ",14,7,9,4,9);

        /* zweite manschaft */
        Trainer trainer2 =new Trainer("ali",17,5);
        Torwart torwart2 =new Torwart("mohammad",24,4,5,2);
        Spieler gastSpieler1 =new Spieler("farid",14,4,8,7,42);
        Spieler gastSpieler2= new Spieler( "molah",15,3,4,7,6);
        Spieler gastSpieler3 = new Spieler("kololah",5,9,8,3,7);
        Spieler gastSpieler4 = new Spieler("Akbar",54,2,4,7,1);

        ArrayList<Spieler> spielerListe = new ArrayList<>();
        spielerListe.add(spieler1);
        spielerListe.add(spieler2);
        spielerListe.add(spieler3);
        spielerListe.add(spieler4);

        Mannschaft mannschaft1 = new Mannschaft("FC Bolani ", trainer1,torwart1,spielerListe );




        ArrayList<Spieler>spielerliste2 = new ArrayList<>();
        spielerliste2.add(gastSpieler1);
        spielerliste2.add(gastSpieler2);
        spielerliste2.add(gastSpieler3);
        spielerliste2.add(gastSpieler4);
        Mannschaft mannschaft2 = new Mannschaft("SV Podari",trainer2,torwart2,spielerliste2);

        Spiel spiel1 = new Spiel(mannschaft1,mannschaft2);
        try {
            GamePlay.spielen(spiel1);

        }catch (SpielAbruchException abu){
            System.out.println(abu.getMessage());
        }
        System.out.println(spiel1.getSpielbericht());
    }
}
