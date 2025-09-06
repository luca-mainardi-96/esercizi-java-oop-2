package Esercizio_8;

public class FiltraIniziaConA implements Filtrabile{

    public FiltraIniziaConA(){}

    @Override
    public boolean accetta(String elemento){
        return elemento.toUpperCase().charAt(0) == 'A';
    }

}
