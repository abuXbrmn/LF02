public class Ergebnis {
    private int heim;
    private int toregast;

    public Ergebnis(){}

    public int getHeim() {
        return heim;
    }

    public void setHeim(int heim) {
        this.heim = heim;
    }

    public int getToregast() {
        return toregast;
    }

    public void setToregast(int toregast) {
        this.toregast = toregast;
    }
    @Override
    public String toString(){
        String ausgabe = "\n ToreHeim " + heim;
        ausgabe+= "\n Toregast " + toregast;
        return ausgabe;
    }
}
