package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Vi skapar konkreta Pokemon-objekt (inte Pokemon direkt, eftersom den är abstract).
        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Susan");

        Balbasaur b1 = new Balbasaur("Lois");
        Balbasaur b2 = new Balbasaur("Laura");

        // Vi kan inte instansiera Pokemon direkt.
        // Syftet med abstract är att tvinga fram mer specifika typer med tydligt beteende.
        // Pokemon p = new Pokemon("", )

        // Listan är typad som Pokemon för att kunna lagra flera underklasser tillsammans.
        ArrayList<Pokemon> pokedex = new ArrayList<>();

        pokedex.add(p1);
        pokedex.add(b1);
        pokedex.add(p2);
        pokedex.add(b2);

        // Polymorfism: samma metodanrop (attack) ger olika resultat beroende på faktisk typ.
        for (Pokemon p : pokedex) {
            p.attack();
        }

        // Här använder vi en metod som bara finns i Balbasaur.
        b2.talk();

        // Variabeln är av typen Pokemon, men refererar till ett konkret objekt i listan.
        Pokemon currentPokemon = pokedex.get(2);

        // Även här gäller polymorfism: rätt attack-metod väljs vid körning.
        currentPokemon.attack();


    }
}