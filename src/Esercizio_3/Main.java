package Esercizio_3;

public class Main {
    public static void main(String[] args) {
        Calcolabile q1 = new Quadrato(15);
        Calcolabile r1 = new Rettangolo(15, 25);

        stampaRisultato(q1);
        stampaRisultato(r1);
    }

    public static void stampaRisultato(Calcolabile c) {
        System.out.println("Risultato: " + c.calcola());
    }

    
}
