import Esercio_1.Rettangolo;
import Esercizio_2.Chiamata;
import Esercizio_2.SIM;
import Esercizio_3.Articolo;
import Esercizio_3.Carrello;
import Esercizio_3.Cliente;


import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // es 1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("inserisci la base del primo rettangolo");
//        int base1 = sc.nextInt();
//        System.out.println("inserisci l'altezza del primo rettangolo");
//        int altezza1 = sc.nextInt();
//        Rettangolo t1 = new Rettangolo(base1, altezza1);
//        System.out.println("inserisci la base del secondo rettangolo");
//        int base2 = sc.nextInt();
//        System.out.println("inserisci l'altezza del secondo rettangolo");
//        int altezza2 = sc.nextInt();
//        Rettangolo t2 = new Rettangolo(base2, altezza2);
//        Rettangolo.stampaRettangolo(t1.base, t1.altezza);
//        Rettangolo.stampaRettangolo(t2.base, t2.altezza);
//        Rettangolo.stampaDueRettangoli(t1.base, t1.altezza, t2.base, t2.altezza);

        // es2

//        SIM sim1 = new SIM("+39 3494888804");
//        sim1.aggiungiCredito(27.7);
//
//        Chiamata[] listaChiamate = new Chiamata[5];
//        listaChiamate[0] = new Chiamata("+39 3494278805", 20);
//        listaChiamate[1] = new Chiamata("+39 3459278805", 1);
//        listaChiamate[2] = new Chiamata("+39 3494275405", 70);
//        listaChiamate[3] = new Chiamata("+39 3494278886", 1);
//        listaChiamate[4] = new Chiamata("+39 3494272358", 2);
//        sim1.setListaChiamate(listaChiamate);
//        sim1.stampaDati();

        // es3
        Cliente antonio = new Cliente("124", "Antonio", "Costantini", "ant@cost.com", new Date());
        Articolo telefono = new Articolo("Iphone", "HighLevel", 1040);
        telefono.aggiungiPezziAMagazzino(1050);
        System.out.println(telefono);
        Articolo tv = new Articolo("Samsung", "MidLevel", 500);
        Carrello carrelloDiAldo = new Carrello(antonio);

        Articolo[] listaArticoliComprati = { telefono, tv };
        carrelloDiAldo.setElencoArticoli(listaArticoliComprati);
        System.out.println(carrelloDiAldo.getTotaleCostoArticoli());
    }

}