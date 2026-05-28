package org.example;

// Pikachu är en specialiserad Pokemon och återanvänder därför basklassens struktur.
public class Pikachu extends Pokemon {


    public Pikachu(String name) {
        // super(...) anropar basklassens konstruktör så att gemensamma fält
        // (namn, typ och eventuell gemensam initiering) sätts på ett ställe.
        super(name, "elctric");

    }

    @Override
    public void attack() {
        // Override används för att ge Pikachu ett eget attackbeteende,
        // vilket är kärnan i polymorfism.
        System.out.println("Picachu " +  this.name + "Attacks!!");
    }

}
