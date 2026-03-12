package rollenspiel;

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

    public void zauber() throws KeineKraktException {
        if (zauberpunkte>1){
            zauberpunkte=zauberpunkte-1;
            System.out.println(getName()+"\t Zäubert");
        }
        else {
            throw new KeineKraktException(getName(),  " zu schwach für Zaubern");
        }
    }
    public void trinken(){
        zauberpunkte=zauberpunkte+3;
        System.out.print(getName()+"trinkt gerade ein redbull\n");
    }
}
