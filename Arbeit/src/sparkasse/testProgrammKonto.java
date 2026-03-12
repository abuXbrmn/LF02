package sparkasse;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class testProgrammKonto {
    public static void main(String[] args) throws BetragNichtKorrektException, KriditlimitUeberschrittenExcepotion {
        Mitarbeiter mitarbeiter = new Mitarbeiter("holger", "geldfuchs");
        Kunde k1 = new Kunde("samadi", "qaher", new Mitarbeiter("ali", "amir"));
        Adresse k11 = new Adresse("hamburg Str", "134", "232265a", "kabul");

        Girokonto girokonto1 = new Girokonto(k1, 1.0, 0.0, 0.0);
        Girokonto girokonto2 = new Girokonto(k1, 1.0, 1000.0, 15.0);
        Sparkonto sparkonto = new Sparkonto(k1, 3.0);

        System.out.println(mitarbeiter.getVorname());
        System.out.println(k1.getVorname());
        System.out.println(girokonto1);
        System.out.println(girokonto2);
        System.out.println(sparkonto);
        System.out.println("----------------------");
        sparkonto.einzahlen(1500);
        try {
            sparkonto.auszahlen(200.0);
        } catch (BetragNichtKorrektException e) {
            System.out.println(e.getMessage());
        } catch (KriditlimitUeberschrittenExcepotion e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sparkonto);
    }
}
