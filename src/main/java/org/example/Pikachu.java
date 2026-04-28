package org.example;

// pikachu ärver av pokemon
public class Pikachu extends Pokemon { // pikachu ÄR en Pokemon


    public Pikachu(String name) {
        super(name, "elctric");  // använd konstruktören för super-klassen (den vi ärver av)

    }

    @Override
    public void attack() {
        System.out.println("Picachu " +  this.name + "Attacks!!");
    }

}
