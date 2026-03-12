package rollenspiel;

public class KeineKraktException extends Exception{
    private String name ;
    private String aktion;


    public KeineKraktException(String name, String aktion){
        this.name=name;
        this.aktion=aktion;

    }
    @Override
    public String getMessage(){
       String getMessag=" ihre Figur hat viel zu wenig Energie\t" + name;
       return getMessag;
    }
}
