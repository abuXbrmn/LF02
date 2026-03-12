package Fussbal;

public class SpielAbruchException extends Exception {

    private  int spielMin;

    public SpielAbruchException(int spielMin){
        this.spielMin = spielMin;
    }

    public int getSpielMin() {
        return spielMin;
    }

    @Override
    public String getMessage(){
        String getMessage = "Es ist ein fehler auf getretten " + getSpielMin() +"min";
        return getMessage;
    }
}
