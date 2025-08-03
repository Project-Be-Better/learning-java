package com.Basics;

public class Chapter2If {

    /**
     * Run function for the java class
     */
    public void run() {

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Great");
                break;
            case 'B':
            case 'C':
                System.out.println("Pass");
                break;
            default:
                System.out.println("Not Available");
        }

        String result = switch (grade) {
            case 'A' -> "Great";
            case 'B','C','D' -> "Pass";
            default -> "unknown";
        };

        System.out.println("from new switch: " + result);

    }
}
