package KraftFahrzeuge;

public class kraftfahrzeuge {
    private String marke ;
    private  String model;
    private String farbe;
    private int baujahr;

    public kraftfahrzeuge(String marke , String model,String farbe, int baujahr){
        this.marke=marke;
        this.model=model;
        this.farbe=farbe;
        this.baujahr= baujahr;
    }
    public String getMarke(){
        return marke;
    }
    public  String getModel(){
        return model;
    }
    public void setFarbe(String farbe){
        this.farbe=farbe;
    }
    public String getFarbe(){
        return farbe;
    }
    public void setBaujahr(int baujahr){
        this.baujahr=baujahr;
    }
    public int getBaujahr(){
        return baujahr;
    }
    @Override
    public String toString(){
        String ausgabe = "\n\t Marke :"+getModel();
        ausgabe +="\n\t Model :"+getModel();
        ausgabe +="\n\t Farbe :"+getFarbe();
        ausgabe +="\n\t Baujahr :"+getBaujahr();
        return ausgabe;
    }
}
