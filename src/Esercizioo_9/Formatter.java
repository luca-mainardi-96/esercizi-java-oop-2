package Esercizioo_9;

public class Formatter {

    public Formatter(){}

    public Messaggio formattaMessaggio(Messaggio msg){
        return new Messaggio(msg.getTesto().toUpperCase());
    }

}
