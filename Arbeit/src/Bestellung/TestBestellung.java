package Bestellung;

public class TestBestellung {
    public static void main(String[] args) {
        CD cd = new CD(2638.2,"halo");
        Buch buch = new Buch( 748383.3,"jermeny");

        Lieferschein lieferschein =new Lieferschein();
    Rechnung rechnung= new Rechnung();
    Adresse adresse = new Adresse("hfeufejf","fhfh","3839j","bremen");
     Lieferschein lieferschein1 = new Lieferschein();
        Konto konto1 = new Konto("abc536","23e2");

         Kunde kunde = new Kunde("jfkfmf",konto1,adresse,adresse);
        Betellung betellung = new Betellung(lieferschein1,rechnung,kunde);
        betellung.addArtikel(cd);
        betellung.addArtikel(buch);
        System.out.println(betellung.getGesamtpreis());
}
}