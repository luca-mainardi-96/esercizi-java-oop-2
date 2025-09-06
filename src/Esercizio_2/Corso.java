package Esercizio_2;

public class Corso {

    private String nomeCorso;

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

    /*

    Impostando un array si stabilisce già un limite che può stampare un messaggio di errore in caso venga superato il limite di posti.

    private Studente[] iscritti; 
    private int contaIscritti;

    public Corso(String nomeCorso){
        this.nomeCorso = nomeCorso;
        this.iscritti = new Studente[2];
    }

    public void iscrivi(Studente s){
        if(contaIscritti < iscritti.length){
            this.iscritti[contaIscritti] = s;
            system.out.println("lo studente " + s.getNome() + " è iscritto al corso di " + this.nomeCorso;)
        } else {
            system.out.println("Posti terminati.") 
        }
    }
    */
}
