package Tresor;

public class GegenStandNichtGefundenException extends Exception{
     private int iD;
    public GegenStandNichtGefundenException(int iD){
     this.iD=iD;
    }

    public int getiD() {
        return iD;
    }
    @Override
    public String getMessage(){
        return ("Gegenstände mit dieser ID "+iD+ "exstiert nicht ");
    }
}
