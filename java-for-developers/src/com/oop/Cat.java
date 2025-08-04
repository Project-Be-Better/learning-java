package com.oop;

import java.util.Objects;

public class Cat implements Animal {
    private String name;
    private int age;

    public Cat() {

    }

    public Cat(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

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

    @Override
    public String toString() {
        return String.format("""
                Cat profile :
                Name    " %s,
                Age     : %d
                """,this.name, this.age);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
