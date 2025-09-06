package Esercizio_6;

public class Main {

    public static void main(String[] args) {
        
        Animale[] animali = {new Cane(), new Gatto()};

        for(int i = 0; i < animali.length; i++){
            animali[i].verso();
        }

    }

    /*
        for (animale a : animali){
        a.verso();
        }
     */

}
