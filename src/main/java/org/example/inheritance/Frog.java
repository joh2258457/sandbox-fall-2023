package org.example.inheritance;

public class Frog extends Amphibian{
    public Frog(String name) {
        this.setName(name);
    }

    public Frog() {
        this("Frog");
    }

    @Override
    public void eat() {
        System.out.println("eating frog");
    }

    @Override
    public void makeSound() {
        System.out.println("Making a frog sound");
    }


    @Override
    public void hunt() {

    }

    @Override
    public void track() {

    }

    @Override
    public void socialize() {

    }
}
