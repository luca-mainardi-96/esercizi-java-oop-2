package Esercizio_7;

public class Main {

    public static void main(String[] args) {
        
        Contatore cont = new Contatore();
        Controllore ctrl = new Controllore();

        ctrl.eseguiIncremento(cont);
        System.out.println(cont.getN());

        ctrl.eseguiIncremento(cont);
        System.out.println(cont.getN());

        ctrl.eseguiIncremento(cont);
        System.out.println(cont.getN());

    }

}
