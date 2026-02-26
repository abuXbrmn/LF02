public class Elfe extends Charaktere {
//private int staerkepunkte;
 private int rennen;

    public Elfe(String name, int staerkepunkte,int rennen) {
        super(name, staerkepunkte);
        this.rennen=rennen;
    }

    public int getRennen() {
        return rennen;
    }

    public void setRennen(int rennen) {
        this.rennen = rennen;
    }

    public void rennen() throws KeineKraktException {
        if (getStaerkepunkte() >= 2) {
            setStaerkepunkte(getStaerkepunkte() - 2);
            System.out.println(getName() + " rennt!!");
        }else {
            throw  new KeineKraktException(getName(),"zu schwach für rennen ");
        }
    }
}
