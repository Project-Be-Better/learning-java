package org.xploretown.abstractClasses;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Cat extends Mammal {

    public Cat(){
        super("Catlica Mamalica Animalica");
    }
    @Override
    public void makeSound() {
      log.info("Makes sound like Meow and acts like a Mini tiger");
    }
}
