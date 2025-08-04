import com.accessmodifiers.AccessModifier;
import com.basics.*;
import com.oop.Cat;

public class Main {
    public static void main(String[] args) {

        /**
         * 
         * Chapter1ForLoops chapter1ForLoops = new Chapter1ForLoops();
         * chapter1ForLoops.run();
         * 
         * Chapter2If chapter2If = new Chapter2If();
         * chapter2If.run();
         * 
         * Chapter4AccessModifier chapter4AccessModifier = new Chapter4AccessModifier();
         * chapter4AccessModifier.run();
         * 
         * AccessModifier accessModifier = new AccessModifier();
         * accessModifier.revealSecret();
         * 
         * // ! This cannot be accessed
         * // System.out.println(accessModifier.secret);
         * 
         * Chapter7Enums chapter7Enums = new Chapter7Enums();
         * chapter7Enums.run();
         * 
         * Chapter8Dates chapter8Dates = new Chapter8Dates();
         * chapter8Dates.run();
         * 
         * Chapter10BigDecimal chapter10BigDecimal = new Chapter10BigDecimal();
         * chapter10BigDecimal.run();
         * 
         * Chapter12ExceptionHandling chapter12ExceptionHandling = new
         * Chapter12ExceptionHandling();
         * chapter12ExceptionHandling.run();
         */
        Cat cat1 = new Cat("Rose", 12);
        Cat cat2 = new Cat("Rose", 12);
        System.out.println(cat1.equals(cat2));

    }
}