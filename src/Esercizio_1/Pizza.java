package Esercizio_1;

public class Pizza {
   
    private boolean mozzarella;
    private boolean pomodoro;
    private boolean prosciutto;

    public Pizza aggiungiMozzarella(){
        this.mozzarella = mozzarella;
        return this;
    }

    public Pizza aggiungiPomodoro(){
        this.pomodoro = pomodoro;
        return this;
    }

    public Pizza aggiungiProsciutto(){
        this.prosciutto = prosciutto;
        return this;
    }

}

/*
import java.util.Collections;
import.java.util.List;

public class Pizza {
    private List<String> ingredienti;

    public Pizza(){
        this.ingredienti = new ArrayList<>();
    }

    public List<String> getIngredienti(){
        return Collections.unmodifiableList(this.ingredienti); -------> così si impedisce che il getter possa rompere il codice.
    }

    public Pizza aggiungiMozzarella(){
        this.ingredienti.add("Mozzarella");
        return this;
    }

    public Pizza aggiungiPomodoro(){
        this.ingredienti.add("Pomodoro");
        return this;
    }

    public Pizza aggiungiProsciutto(){
        this.ingredienti.add("Prosciutto");
        return this;
    }
}
*/