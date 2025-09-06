package Esercizio_5;

public class Utente {

    private String nome;
    private String email;

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

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void stampa(){
        System.out.println("Nome Utente: " + this.getNome());
        System.out.println("E-mail Utente: " + this.getEmail());
    }

}
