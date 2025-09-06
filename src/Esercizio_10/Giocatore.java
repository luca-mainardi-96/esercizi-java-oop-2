package Esercizio_10;

public class Giocatore {

    public Giocatore(){}

    public void attacca(Attaccabile nemico, int danno){
        nemico.subisciDanno(danno);
    }

}
