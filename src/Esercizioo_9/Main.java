package Esercizioo_9;

public class Main {

    public static void main(String[] args) {
        Messaggio m = new Messaggio("Ciao a tutti");

        Formatter f = new Formatter();
        Messaggio m2 = f.formattaMessaggio(m);

        System.out.println(m2.getTesto());
    }
}
