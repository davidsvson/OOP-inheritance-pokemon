package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Susan");

        Balbasaur b1 = new Balbasaur("Lois");
        Balbasaur b2 = new Balbasaur("Laura");

        //  kan och vill inte skapa Pokemon objekt eftersom klassen är abstract
        // Pokemon p = new Pokemon("", )

        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(b1);
        pokedex.add(p2);
        pokedex.add(b2);

        for (Pokemon p : pokedex) {
            p.attack();
        }

        b2.talk();

        Pokemon currentPokemon = pokedex.get(2);

        currentPokemon.attack();


    }
}