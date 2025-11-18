package org.xploretown;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GenericsPractice genericsPractice = new GenericsPractice();
        genericsPractice.printToConsole();

    }
}
