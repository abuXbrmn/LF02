package Bestellung;

import java.util.ArrayList;

public class Betellung {
    ArrayList<Artikel> aritelarrayList= new ArrayList<>();
    Lieferschein lieferschein;
    Rechnung rechnung;
    Kunde kunde;

     public  Betellung(Lieferschein lieferschein,Rechnung rechnung,Kunde kunde){
         this.lieferschein=lieferschein;
         this.rechnung=rechnung;
         this.kunde=kunde;
     }
     public double getGesamtpreis(){
         double gesamtwer =0;
         for (Artikel a: aritelarrayList)
             gesamtwer+=a.getPreis();



         return  gesamtwer;
     }

     public void addArtikel( Artikel artikel){
         aritelarrayList.add(artikel);

     }
}
