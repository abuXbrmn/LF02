package KraftFahrzeuge;

public class PKW extends Kraftfahrzeuge {
    private boolean Cabrio ;

    public PKW(String marke,String model , String farbe,int baujahr, double wert){
        super(marke,model,farbe,baujahr ,wert);
        this.Cabrio=Cabrio;
    }
    public void setCabrio(boolean Cabrio){
        this.Cabrio= Cabrio;
    }

    public boolean isCabrio() {
        return Cabrio;
    }
    @Override
    public String toString(){
        String ausgabe = "\n\t Marke :"+getMarke();
        ausgabe +="\n\t Model :"+getModel();
        ausgabe +="\n\t Farbe :"+getFarbe();
        ausgabe +="\n\t Baujahr :"+getBaujahr();
        ausgabe+="\n\t Cabrio ;"+isCabrio();
        ausgabe +="\n\t Wert ;"+getWert();
        return ausgabe;
    }
}
