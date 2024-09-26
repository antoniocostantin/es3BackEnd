package Esercio_1;

public class Rettangolo {

    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public void setBase(int base) { this.base = base; }
    public void setAltezza(int altezza) { this.altezza = altezza; }
    public int getBase() { return base; }
    public int getAltezza() { return altezza; }

    public static void stampaRettangolo(int base, int altezza) {
        int perimetro = ( base + altezza) * 2 ;
        int area = (base * altezza);
        System.out.println("il perimetro del rettangolo è :" + perimetro + " l' area invece è :" + area);
    }

    public static void stampaDueRettangoli(Rettangolo t1, Rettangolo t2) {
        int perimetro1 = (t1.getBase() + t1.getAltezza()) * 2;
        int area1 = (t1.getBase() * t1.getAltezza()) ;
        int perimetro2 = (t2.getBase() + t2.getAltezza()) * 2;
        int area2 = (t2.getBase() * t2.getAltezza());
        System.out.println("il perimetro del primo rettangolo è :" + perimetro1 + " l' area invece è :" + area1);
        System.out.println("il perimetro del secondo rettangolo è :" + perimetro2 + " l' area invece è :" + area2);
        System.out.println("la somma dei perimetri è :" + perimetro1 + perimetro2 + " la somma delle aree invece è :" + area1 + area2);

    }

}
