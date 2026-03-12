package sparkasse;

public class Sparkonto extends Konto {
    public Sparkonto(Kunde inhaber ,double zinssatz){
        super(inhaber, 0, zinssatz);
    }
@Override
    public String toString(){
        StringBuilder ausgabe = new StringBuilder();
        ausgabe.append(super.toString()+"\n");
        return ausgabe.toString();
}
}

