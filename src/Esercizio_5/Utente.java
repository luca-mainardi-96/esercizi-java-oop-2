package Esercizio_5;

import java.time.LocalDate;
public class Utente {

    private String nome;
    private String email;
    private LocalDate dataNascita;

    public Utente(){

    }

    public Utente setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Utente setEmail(String email) {
        this.email = email;
        return this;
    }

    public Utente setDataNascita (LocalDate dataNascita) {
        this.dataNascita = dataNascita;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void stampa(){
        System.out.println("Nome Utente: " + this.getNome());
        System.out.println("E-mail Utente: " + this.getEmail());
        System.out.println("Data di nascita: " + this.getDataNascita());
    }

}
