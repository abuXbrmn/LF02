package Tresor;

public class Test1 {
    public static void main(String[] args) {
        Schmuck schmuck1 = new Schmuck(200,2500.6,"kette");
        System.out.println(schmuck1);
        Schmuck sch2 = new Schmuck(456,365.3,"uhr");
        Aktie ak = new Aktie(24,23.3,"cola",23.32);
        Aktie ab = new Aktie(342,234.3,"halil",234323);
        System.out.println(ak);
        System.out.println(sch2);
        System.out.println(ab);
    }
}
