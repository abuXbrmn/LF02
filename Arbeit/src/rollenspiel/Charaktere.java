package rollenspiel;

public  abstract class   Charaktere {
    private String name;
    private int staerkepunkte;

    public Charaktere(String name, int staerkepunkte) {
        this.name = name ;
        this.staerkepunkte=staerkepunkte;
}

    public int getStaerkepunkte() {

        return staerkepunkte;
    }

    public void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public void laufen() throws KeineKraktException {
        if (staerkepunkte>=1) {
            staerkepunkte = staerkepunkte - 1;
            System.out.println(name + " lauft ");

        }else {
            throw new KeineKraktException(name," zu schwach für laufen");
        }
}
    public void klettern () throws KeineKraktException {
        if (staerkepunkte>=2) {
            staerkepunkte = staerkepunkte - 2;
            System.out.println(name + " klettert");
        }else {
            throw new KeineKraktException(name," zu Schwach für klettern");
        }
    }

    public void kampfen () throws KeineKraktException {
        if (staerkepunkte>=3){
            staerkepunkte = staerkepunkte - 3;
            System.out.println(name + " kämpft");
        }else
            throw new KeineKraktException(name,"Zuschwach für kämpfen");
    }
    public void essen () {
        System.out.println(name + "\tisst etwas.");
        staerkepunkte += 10;
    }

    @Override
    public String toString(){
        String ausgabe ;
        ausgabe= "\n Name "+"\t\t\t\t\t |" +name;
        ausgabe+= "\n Stärkepunkte "+" \t\t\t |"+staerkepunkte;
    return  ausgabe;}
}
