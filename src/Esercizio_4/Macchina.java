package Esercizio_4;

public class Macchina {

    private String marca;
    private String modello;
    private Motore motore;

    public Macchina(String marca, String modello){
        this.marca = marca;
        this.modello = modello;
    }

    public void parti(){
        this.motore = new Motore("Marca motore");
        this.motore.accendi();
    }

}
