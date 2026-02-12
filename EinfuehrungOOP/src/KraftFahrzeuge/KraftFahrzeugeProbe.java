package KraftFahrzeuge;

import java.util.ArrayList;

public  class KraftFahrzeugeProbe {
    public static void main(String[] args) {

        Lkw Lkw1 = new Lkw("Bmw", "Black series", "Schwarz", 2008, 27.000);
        System.out.println(Lkw1);
        System.out.println("1------------------------------------");


        Kraftfahrzeuge[] autos = new Kraftfahrzeuge[3];
        autos[0] = new Lkw("Audi", "4x6", "schwarz", 5, 40.000);
        autos[1] = new PKW("Bmw", "M5cs", "Matt-Rot", 2024, 120.000);
        autos[2] = new PKW("Mercedes", "Cls", "Schwarz", 2018, 35.000);

        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
        System.out.println("2--------------------------------");
        for (Kraftfahrzeuge kraftfahrzeuge : autos) {
            System.out.println(kraftfahrzeuge);
        }
        System.out.println("3-----------------------------");
        ArrayList<Kraftfahrzeuge> kraftfahrzeuges = new ArrayList<>();
        kraftfahrzeuges.add(Lkw1);
        kraftfahrzeuges.add(new Lkw("abu", "hat", "heute", 3, 33333.3));
        System.out.println(kraftfahrzeuges.size());
        System.out.println("4--------------------------");


        double gewichtGesammtSumme = 0;
        for (Kraftfahrzeuge reife : kraftfahrzeuges) {
            gewichtGesammtSumme += reife.getWert();
            System.out.println(reife);
            System.out.println("5------------------------");
        }

        System.out.println("Gesammtwert von alle Fahrzeuge :"+gewichtGesammtSumme);
        System.out.println("6*----------------------");
    }
}