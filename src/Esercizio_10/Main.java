package Esercizio_10;

public class Main {

    public static void main(String[] args) {
        
        Attaccabile n = new Personaggio("x", 100);
        Giocatore p = new Giocatore();

        p.attacca(n, 70);

        System.out.println(n.getPuntiVita());

    }

}
