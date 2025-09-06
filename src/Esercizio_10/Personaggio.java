package Esercizio_10;

public class Personaggio implements Attaccabile {

    private String nome;
    private int puntiVita;

    public Personaggio(String nome, int puntiVita){
        this.nome = nome;
        this.puntiVita = puntiVita;
    }

    @Override
    public void subisciDanno(int danno){
        this.puntiVita -= danno;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int getPuntiVita() {
        return puntiVita;
    }

    

}
