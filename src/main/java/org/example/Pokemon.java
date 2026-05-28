package org.example;

// Basklass för alla Pokemon-typer.
// Klassen är abstract för att tvinga fram att vi skapar specifika Pokemon
// (t.ex. Pikachu/Balbasaur) istället för generiska Pokemon utan tydlig identitet.
public abstract class Pokemon {
    // protected används så att subklasser kan använda namnet direkt i sin egen logik,
    // exempelvis när de skriver ut specialiserade attacker.
    protected String name;

    // type hålls private för att skydda intern data och styra åtkomst via getter.
    private String type;

    // static gör att räknaren delas av alla objekt, så vi kan följa hur många
    // Pokemon som totalt har skapats i programmet.
    public static int count;

    // Exempel på en vanlig instansvariabel: varje objekt får sitt eget värde.
    private int count2;

//    public Pokemon() {
//        this.name = "";
//        this.type = "";
//    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
        // Ökas i konstruktorn för att garantera att varje skapad instans räknas en gång.
        count++;
    }



    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        // Standardbeteende som kan ärvas eller skrivas över av subklasser.
        System.out.println(this.name + " Attacks!");
    }

}
