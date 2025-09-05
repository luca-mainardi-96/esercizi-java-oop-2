package Esercizio_2;
import java.time.LocalDate;

public class Studente {

    private int numeroMatricola;
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private int annoImmatricolazione;

    public int getNumeroMatricola() {
        return numeroMatricola;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setNumeroMatricola(int numeroMatricola) {
        if(numeroMatricola <= 0){
            System.out.println("Il numero di matricola non può essere negativo.");
        }else{
            this.numeroMatricola = numeroMatricola;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    

}


/* 
  Crea due classi: `Studente` e `Corso`.
La classe `Studente` contiene informazioni come nome e matricola.
La classe `Corso` deve avere un metodo `iscrivi(Studente studente)` che stampa un messaggio
come:
`Studente Mario iscritto al corso di Matematica`.
Questo esercizio serve per esercitarsi con metodi che ricevono oggetti di classi custom come
argomenti.
 */