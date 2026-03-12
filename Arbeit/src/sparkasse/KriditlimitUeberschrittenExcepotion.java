package sparkasse;

public class KriditlimitUeberschrittenExcepotion extends Exception{
    private double betrag;
    private double kriditlimt;
    public KriditlimitUeberschrittenExcepotion(double betrag,double kriditlimit){
        this.betrag=betrag;
        this.kriditlimt=kriditlimit;
    }
    @Override
    public String getMessage(){
        String getMessage= "Der Vorgang ist nicht möglich, da der Kriditlimit überacgritten wurde "+kriditlimt;
    return  getMessage;}
}
