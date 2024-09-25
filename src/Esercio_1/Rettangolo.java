package Esercio_1;

public class Rettangolo {

    public int base;
    public int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public static void stampaRettangolo(int base, int altezza) {
        int perimetro = ( base + altezza) * 2 ;
        int area = (base * altezza);
        System.out.println("il perimetro del rettangolo è :" + perimetro + " l' area invece è :" + area);
    }

    public static void stampaDueRettangoli(int base1, int altezza1, int base2, int altezza2) {
        int perimetro1 = (base1 + altezza1) * 2;
        int area1 = (base1 * altezza1) ;
        int perimetro2 = (base2 + altezza2) * 2;
        int area2 = (base2 * altezza2);
        System.out.println("il perimetro del primo rettangolo è :" + perimetro1 + " l' area invece è :" + area1);
        System.out.println("il perimetro del secondo rettangolo è :" + perimetro2 + " l' area invece è :" + area2);
        System.out.println("la somma dei perimetri è :" + perimetro1 + perimetro2 + " la somma delle aree invece è :" + area1 + area2);

    }

}
