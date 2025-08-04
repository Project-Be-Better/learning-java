package com.basics;

public class Chapter1ForLoops {

    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        String[] names = {
                "Abby", "Roy", "Eric"
        };

        System.out.println("Normal Loop".toUpperCase());

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println("Enhanced For Loop".toUpperCase());

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("While Loop".toUpperCase());
        int i = 1;

        while (i < 5) {
            System.out.println("while loop, i: " + i);
            i++;
        }

        do {
            System.out.println("Do While Checking the value of i: " + i);
            i++;
        } while (i < 5);
    }
}
