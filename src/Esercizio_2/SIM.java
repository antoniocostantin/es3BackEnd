package Esercizio_2;


public class SIM {
    public String numCellulare;
    public double credito;
    public Chiamata[] chiamate;

    public SIM(String numCellulare) {
        this.numCellulare = numCellulare;
        this.credito = 0;
        this.chiamate = new Chiamata[5];
    }

    public void aggiungiCredito(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    public void setListaChiamate(Chiamata[] listaChiamate) {
        this.chiamate = listaChiamate;
    }

    public void stampaDati() {
        System.out.println("Sim: " + this.numCellulare);
        System.out.println("Credito disponibile: " + this.credito);
        for (int i = 0; i < this.chiamate.length; i++) {
            if (chiamate[i] != null) {
                System.out.println("- Chiamata " + i + " a : "  + chiamate[i].numeroChiamato + " - Durata : "
                        + chiamate[i].durata);
            }
        }
    }
}
