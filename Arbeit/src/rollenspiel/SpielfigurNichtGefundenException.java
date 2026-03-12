package rollenspiel;

public class SpielfigurNichtGefundenException extends Exception {
    String name ;
    public SpielfigurNichtGefundenException(String name ){
        this.name = name;
    }
    public String getName(){
        return name;

    }
    @Override
    public String getMessage(){
        return "die backend.Spielfigur mit der name "+name+"konnte nicht gefunden werden ";
    }
}
