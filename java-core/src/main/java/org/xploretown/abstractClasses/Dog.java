package org.xploretown.abstractClasses;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Dog extends Mammal{

    public Dog(){
        super("Doggo Mamalica Animalica");
    }
    @Override
    public void makeSound() {
      log.info("Goes Bow Wow wow.. Dont call me rapper Yo!");
    }
}
