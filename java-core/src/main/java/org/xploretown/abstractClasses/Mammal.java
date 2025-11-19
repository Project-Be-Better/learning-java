package org.xploretown.abstractClasses;

import lombok.extern.slf4j.Slf4j;

@Slf4j
abstract public class Mammal implements Animal{

    public final String species;

    protected Mammal(String species) {
        this.species = species;
        log.info("Creating a mammal of species {}", species);
    }


    /**
     * Concrete method
     */
    public void giveBirth(){
        log.info("Gives birth to offsprings");
    }

    /**
     * Abstract method that should be enforced by implementing classes
     */
    public abstract void makeSound();

}
