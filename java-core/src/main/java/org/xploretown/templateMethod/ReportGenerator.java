package org.xploretown.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class ReportGenerator {

    private void printHeader(){
        log.info("Printing Header");
    }
    protected abstract void printBody();
    private void printFooter(){
        log.info("Printing Footer");
    }

    public final void generateReport(){
        printHeader();
        printBody();
        printFooter();
    }
}

