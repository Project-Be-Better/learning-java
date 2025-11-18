package org.xploretown;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

public class GenericsPractice {
    private static final Logger logger = LoggerFactory.getLogger(GenericsPractice.class);

    public void printToConsole(){
        logger.info("First statement");
    }
}
