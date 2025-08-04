package com.Basics;

import java.math.BigDecimal;

public class Chapter10BigDecimal {

    public void run(){
        BigDecimal number1 = new BigDecimal("0.02");
        BigDecimal number2 = new BigDecimal("0.05");
        BigDecimal result = number2.subtract(number1);
        System.out.println("The difference of num1: "+number1+" num2: "+number2+ " : "+ result);
    }




}
