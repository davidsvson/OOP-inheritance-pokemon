package org.example;

public abstract class Pokemon {
    protected String name;  // protected - tillgänglig i klassen och alla subklasser
    private String type;

//    public Pokemon() {
//        this.name = "";
//        this.type = "";
//    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(this.name + " Attacks!");
    }

}
