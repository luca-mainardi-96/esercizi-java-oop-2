package Esercizio_8;

public class FiltraParoleLunghe implements Filtrabile{

    public FiltraParoleLunghe(){};

    @Override
    public boolean accetta(String elemento){
        return elemento.length() > 5;
    }

}
