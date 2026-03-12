package rollenspiel;

public class OnlineRollenSpiel {
    public static void main(String[] args) {
        Elfe elfe1 = new Elfe("ali", 5, 0);
        Zauberer Gandalf = new Zauberer("Gandalf", 15, 5);
        System.out.println(elfe1);
        System.out.println(Gandalf);
        try {
            System.out.println(Gandalf.getStaerkepunkte());
            Gandalf.klettern();
            Gandalf.klettern();
            Gandalf.klettern();
            Gandalf.klettern();
            Gandalf.laufen();
            Gandalf.laufen();
            Gandalf.laufen();
            Gandalf.laufen();
            Gandalf.laufen();
            while (Gandalf.getZauberpunkte() > 0) {
                Gandalf.zauber();
            }
        } catch (KeineKraktException e) {
            System.out.println(e.getMessage());
        }
        Gandalf.essen();
        Gandalf.trinken();
        try {
            for (int i = 0; i < 2; i++) {
                Gandalf.kampfen();
            }

        } catch (KeineKraktException e) {
            System.out.println(e.getMessage());
        }

        try {
            for (int i = 0; i < 3; i++) {
                elfe1.laufen();
            }
        } catch (KeineKraktException e) {
            System.out.println(e.getMessage());
        }
            try {
                for (int i = 0; i < 2; i++) {
                    elfe1.klettern();
                }
            }catch (KeineKraktException e ){
                System.out.println(e.getMessage());
            }

        System.out.println(elfe1);
        System.out.println(Gandalf);
        wald wald = new wald();
        wald.addSpielfigur(Gandalf);
        wald.addSpielfigur(elfe1);
        System.out.println();;
        System.out.println(wald);
    }
}
