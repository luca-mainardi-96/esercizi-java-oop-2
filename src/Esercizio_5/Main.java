package Esercizio_5;

import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        
        LocalDate x = LocalDate.now();
        Utente u1 = new Utente();

        u1.setNome("Mario");
        u1.setEmail("Mario@esempio.com");

        u1.stampa();

    }

}
