package Esercizio_3;

public class Quadrato implements Calcolabile {

    private int lato;
    private int area;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    @Override
    public int calcola() {
        this.area = lato * lato;
        return area;
    }

    public int getArea() {
        return area;
    }
}
