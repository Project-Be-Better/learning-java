package com.reference;

import java.awt.*;

class Test1 {
    void runTest1() {
        int x = 10;
        int y = x++;
        int z = ++x;
        System.out.println("Test 1");
        System.out.println("x = " + x); // 11 -> 11+1 - > x = 12
        System.out.println("y = " + y); // 10 -> y = 10
        System.out.println("z = " + z); // 11+1 -> z = 12
    }
}

class Test2 {

    void runTest2() {
        int a = 3;
        System.out.println("Test 2");
        System.out.println("val = " + a++); // a = 3, but after operation, increments to 4
    }
}

class Test3 {

    void runTest3() {
        System.out.println("Test 3");

        int[] arr = new int[3]; // [0,0,0]
        int i = 0; // [0,0,0] i = 0
        arr[i++] = 1; // [1,0,0] i = 1
        arr[i++] = 2;// [1,2,0] i = 2
        arr[i] = 3;// [1,2,3] i = 2
        System.out.println(java.util.Arrays.toString(arr));
    }
}

class Counter {
    int count = 0;
}

class Test4 {
    void runTest4() {
        System.out.println("Test 4");

        Counter c1 = new Counter();
        Counter c2 = c1;

        // both refer to the same reference

        c1.count++; // c1.count = 1
        c2.count++; // c2.count = 2 ; also updates c1.count to 2 because they refere to the same
                    // object

        System.out.println("c1.count = " + c1.count);
        System.out.println("c2.count = " + c2.count);
    }
}

class Test5 {
    void runTest5() {
        System.out.println("Test 5");

        int x = 1;
        int result = x++ + x++ + x; // 1 (use 1, then increment to 2)+ 2 (use 2 and then increment to 3) + 3 (use 3
                                    // as final value) = 6
        System.out.println("result = " + result); // result = 6
        System.out.println("final x = " + x); // final x = 3
    }
}

class Test6Strings {
    void runTest6() {
        System.out.println("Test 6");
        String firstName = "Sree";
        String lastName = "Raj";

        String fullName = firstName + lastName;

        System.out.println("FullName is: " + fullName);
        System.out.println("FullName uppercase: " + fullName.toUpperCase());
        System.out.println("Check if empty: " + " ".isEmpty());
        System.out.println("Check if empty: " + "".isEmpty());
        System.out.println("Check if empty: " + "".isBlank());
        System.out.println("Check if empty: " + " ".isBlank());
        System.out.println("Trim: " + "     a  ".trim());

        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

    }

    public String reverseString(String inputString) {
        String str = new StringBuilder(inputString).reverse().toString();
        return str;
    };
}

class TestPoint {

    void runTestPoint() {
        int age = 21;
        Point point = new Point(10, 29);
        System.out.println("Point: " + point);

    }
}

class TestPassByBalue {
    void update(int x) {
        x = 10;
    }

    static void increment(NewCounter c) {
        c.value++;
    }

    static void reassign(Book b) {
        b = new Book("New Title");
    }

    static void mutate(Book b) {
        b.title = "Updated Title";
    }

    static void changeArray(int[] arr) {
        arr[0] = 99;
    }

    void run() {
        System.out.println("Test Pass By Value");
        int a = 5;
        update(a);
        System.out.println(a); // What is the output 5

        System.out.println("Counter increment");
        NewCounter newCounter = new NewCounter();
        increment(newCounter);
        System.out.println("Counter value is " + newCounter.value); // 1

        System.out.println("Rook title reference");
        Book book = new Book("Original Title");
        reassign(book);
        System.out.println("title after reassigning: " + book.title); // Original TItle

        mutate(book);
        System.out.println("title after mutating: " + book.title); // Updated title

        int[] nums = { 1, 2, 3 };
        changeArray(nums);
        System.out.println(nums[0]); // Yes, {99,2,3}

        int x = 10;
        x += 5;
        System.out.println(x);

    }
}

class NewCounter {
    int value = 0;
}

class Book {
    String title;

    Book(String t) {
        title = t;
    }
}

public class Main {

    /**
     * Thsi is the comment that is going in for the main
     * 
     * @param
     */
    public static void main(String[] args) {
        System.out.println("Amigos Code");

        Test1 test1 = new Test1();
        test1.runTest1();

        Test2 test2 = new Test2();
        test2.runTest2();

        Test3 test3 = new Test3();
        test3.runTest3();

        Test4 test4 = new Test4();
        test4.runTest4();

        Test5 test5 = new Test5();
        test5.runTest5();

        Test6Strings test6 = new Test6Strings();
        test6.runTest6();

        String reverseString = test6.reverseString("hello");
        System.out.println("Reversed string: " + reverseString);

        TestPoint testPoint = new TestPoint();
        testPoint.runTestPoint();

        TestPassByBalue testPassByBalue = new TestPassByBalue();
        testPassByBalue.run();

    }
}
