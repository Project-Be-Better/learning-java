package com.Basics;
import com.AccessModifiers.AccessModifier;

public class Chapter4AccessModifier {

    public void run() {
        System.out.println("Using the access modifier from another package");

        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicAccess();
        accessModifier.privateAccess();


    };

}


