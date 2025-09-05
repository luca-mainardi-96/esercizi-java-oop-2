package Esercizio_2;

public class Corso {

    String nomeCorso;

    public Corso(String nomeCorso){
        this.nomeCorso = nomeCorso;
    }
    
    public void iscrivi(Studente studente){
        System.out.println("Lo studente " + studente.getNome() + " " + studente.getCognome() + " è iscritto al corso di " + this.getNomeCorso() + " ." );
    }

    public String getNomeCorso() {
        return nomeCorso;
    }

    public void setNomeCorso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
    }

}
