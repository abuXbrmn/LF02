public class Zauberer extends Charaktere {
    private int zauberpunkte;

    public Zauberer(String name, int staerkepunkte,int zauberpunkte) {
        super(name, staerkepunkte);
        this.zauberpunkte=zauberpunkte;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }
    public void setZauberpunkte(int zauberpunkte){
        this.zauberpunkte=zauberpunkte;
    }

    public void zauber(){
    }
    public void trinken(){
        zauberpunkte=zauberpunkte+3;

    }
}
