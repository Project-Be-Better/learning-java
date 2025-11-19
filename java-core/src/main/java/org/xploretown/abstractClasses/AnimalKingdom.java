package org.xploretown.abstractClasses;

public class AnimalKingdom {

    public static void execute(){
        Cat cat = new Cat();
        Dog dog = new Dog();


        cat.makeSound();
        cat.giveBirth();

        dog.makeSound();
        dog.giveBirth();
    }
}
