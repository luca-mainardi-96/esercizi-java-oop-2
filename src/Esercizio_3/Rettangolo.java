package Esercizio_3;

public class Rettangolo implements Calcolabile{

    private int base;
    private int altezza;
    private int area;

    public Rettangolo(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public int calcola(){
        this.area = base*altezza;
        return area;
    }

    public int getArea(){
        return area;
    }

}
