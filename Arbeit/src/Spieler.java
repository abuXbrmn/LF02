public class Spieler{
    private String name;
    private int alter ;
    private  int erfahrung ;
    private int staerke;
    private int torschusse;
    private int motivation;
    public Spieler(String name,int alter,int erfahrung,
                   int staerke,int torschusse,int motivation){
        this.name=name;
        this.alter=alter;
        this.erfahrung=erfahrung;
        this.staerke= staerke;
        this.torschusse=torschusse;
        this.motivation=motivation;
    }

    public int getAlter() {
        return alter;
    }
    public void setAlter(int alter){
        this.alter=alter;
    }
    public String getname(){
        return name ;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getErfahrung(){
        return erfahrung;
    }
    public int getStaerke(){
        return staerke;

    }
    public void setStaerke(int staerke){
        this.staerke=staerke;
    }
    public int getTorschusse(){
        return torschusse;
    }

    public void setTorschusse(int torschusse) {
        this.torschusse = torschusse;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    @Override
    public String toString() {
        String ausgabe = "\n Spieler";
        ausgabe += "\n Name: " + name;
        ausgabe += "\n Alt " + alter;
        ausgabe+="\n erfahrung "+erfahrung;

        return super.toString();
    }
}
