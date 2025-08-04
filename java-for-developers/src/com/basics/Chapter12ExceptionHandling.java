package com.basics;

public class Chapter12ExceptionHandling {

    public void run(){

        try{
            int number = Integer.parseInt("1x");
            System.out.println("The parsed integer is: "+number);
        } catch (NumberFormatException e) {
//            throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
