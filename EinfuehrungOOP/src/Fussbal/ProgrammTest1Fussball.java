package Fussbal;

public class ProgrammTest1Fussball {

    public static void main(String[] args) {

        Trainer halil=new Trainer("halil",17,1);
        Spieler mikael = new Spieler("mikael",21,17,9,30,20);
        System.out.println("\n-------------------");
        System.out.println (mikael);
        Torwart mohammad = new Torwart("mohammed",21,9,10,9);
        System.out.println("\n-------------------");
        System.out.println(mohammad);
        System.out.println(halil);
    }
}
