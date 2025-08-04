package com.Basics;

import java.time.*;

public class Chapter8Dates {

    public void run(){
        LocalDateTime someTime =  LocalDateTime.of(2000, Month.DECEMBER,1,1,22);
        System.out.println(someTime);


        LocalDateTime now = LocalDateTime.now();
        System.out.println("now     : "+ now);


        LocalDate date = LocalDate.of(2023, 10, 5);
        System.out.println(date);

        LocalTime time = LocalTime.of(14, 30);
        System.out.println(time);
    }
}
