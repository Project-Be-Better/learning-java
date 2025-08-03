package com.AccessModifiers;

public class AccessModifier {
    private final int secret = 42;

    public void revealSecret(){
        System.out.println("The secret is "+ this.secret);
    };

    public void publicAccess(){
        System.out.println("This is with public access");
    }

    public void privateAccess(){
        System.out.println("This is with private access");
    }

    protected void protectedAccess(){
        System.out.println("This is with default access");

    }

    void defaultAccess(){
        System.out.println("This is with protected access");
    }

}
