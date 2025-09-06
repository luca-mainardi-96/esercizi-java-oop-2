package Esercizio_8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> listaFiltrata(Filtrabile f, List<String> parole) {
        List<String> paroleFiltrate = new ArrayList<>();
        for (String parola : parole) {
            if (f.accetta(parola)) {
                paroleFiltrate.add(parola);
            }
        }
        return paroleFiltrate;
    }

    public static void main(String[] args) {
        List<String> parole = new ArrayList<>();
        parole.add("Automobile");
        parole.add("Casa");
        parole.add("Albero");
        parole.add("Libro");
        parole.add("Scrivania");
        parole.add("Computer");
        parole.add("Telefono");
        parole.add("Aereo");
        parole.add("Orologio");
        parole.add("Zaino");

        Filtrabile f1 = new FiltraParoleLunghe();
        List<String> filtrate1 = listaFiltrata(f1, parole);

        Filtrabile f2 = new FiltraIniziaConA();
        List<String> filtrate2 = listaFiltrata(f2, parole);

        System.out.println(filtrate1);
        System.out.println(filtrate2);
    }
}
