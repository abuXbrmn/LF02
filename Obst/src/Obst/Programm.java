package Obst;

public class Programm {
    public static void main(String[] args) {
        Apfel apfel1= new Apfel(100,20.2,true, "schwarz");
        apfel1.setFarbe("blau");
        Erdbeeer erdbeeer1 = new Erdbeeer(100, 20.0, true,"Extrem süß");
        erdbeeer1.setGewicht( 2.1);
        System.out.println(apfel1);
        System.out.println(erdbeeer1);

        Erdbeeer  erdbeeer2 = new Erdbeeer(50,10.9,false,"nicht süß");
        System.out.println(erdbeeer2);
    }

}
