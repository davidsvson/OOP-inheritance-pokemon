package org.example;

// Balbasaur är en annan konkret Pokemon-klass med eget beteende.
public class Balbasaur extends Pokemon{

    public Balbasaur(String name) {
        // Typen sätts här för att varje Balbasaur automatiskt får rätt grunddata.
        super(name, "grass");
    }

    public void talk() {
        // Egna metoder i subklass visar att varje Pokemon kan ha unika förmågor.
        System.out.println("Argh!!");
    }

}
