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
Crea una classe `Pizza` che permetta di aggiungere ingredienti con metodi come:
`Pizza aggiungiMozzarella();`, `Pizza aggiungiPomodoro();`, `Pizza aggiungiProsciutto();`
Ogni metodo deve restituire lo stesso oggetto `Pizza` per permettere catene di chiamate come:
`Pizza p = new Pizza().aggiungiMozzarella().aggiungiPomodoro();`
L'obiettivo è far comprendere il concetto di metodi che ritornano `this`, spesso utilizzati in Java
per implementare il pattern 'fluent interface'.
*/