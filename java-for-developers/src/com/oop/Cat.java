package com.oop;

public class Cat implements Animal{


    @Override
    public void makeSound() {
        System.out.println("Sound of Animal : Meow");
    }

    @Override
    public void eat() {
        System.out.println("Eating Fish");
    }

    @Override
    public void help() {
        System.out.println("Information Doxxing on the Cat");

    }


}
