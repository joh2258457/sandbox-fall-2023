package org.example.inheritance;
//Ctrl + alt + l = for code cleanup (reformat)
//Shift +alt + down or up key (move code)
public class Zookeeper {
    public static void main(String[] args) {
//        Control+D to duplicate
        Animal animal = new Frog();
        Animal animal2 = new Fish();
        Animal animal3 = new Frog("Fred");
        animal.eat();
        animal2.eat();

        animal.eat();
        animal.makeSound();
        animal2.eat();
        animal2.makeSound();

//        Useful in seeing if the object is an instance of that class
        System.out.println(animal instanceof Frog);
        System.out.println(animal2 instanceof Animal);

//        Its used like this usually
//        if (animal instanceof Frog) {
//            some code
//        }
        animal.setName("Frog");
        animal2.setName("Fish");
//        You typically want to use the protected way or using private and using setter and getters (alt+insert on animal class)

        System.out.println(animal.name);
        System.out.println(animal2.name);
    }
}
