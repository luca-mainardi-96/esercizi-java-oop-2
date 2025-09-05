package Esercizio_2;

public class Main {

    public static void main(String[] args) {
        
        Studente s1 = new Studente();
    
        s1.setNome("Mario");
        s1.setCognome("Rossi");

        Corso c1 = new Corso("Matematica");

        c1.iscrivi(s1);
    }
}
