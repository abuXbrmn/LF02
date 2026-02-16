public class Torwart extends Spieler{

    private int reaktion ;
    public Torwart( String name , int alter ,int stearke, int motivation,int reaktion){
        super(name,alter,stearke, 0, motivation, 0);
        this.reaktion=reaktion;

    }

    public int getReaktion(){
         return reaktion;
    }

    public void setReaktion(int reaktion) {
        this.reaktion = reaktion;
    }
    @Override
    public String toString(){
        String ausgabe ;
        ausgabe = super.toString();
        ausgabe += "\n Stärke "+ "\t\t|" + getStaerke();
        ausgabe +="\n Motivation "+ "\t|" +getMotivation();
        ausgabe += "\n Reaktion " + "\t\t|" +reaktion;

        return ausgabe;
    }
}
