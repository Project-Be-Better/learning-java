package com.Basics;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class Chapter8Dates {

    public void run(){
        LocalDateTime someTime =  LocalDateTime.of(2000, Month.DECEMBER,1,1,22);
        System.out.println(someTime);


        LocalDateTime now = LocalDateTime.now();
        System.out.println("now     : "+ now);


        for(String zone:  ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
    }
}
