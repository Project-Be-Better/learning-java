package com.maven.colors.services.impl;

import com.maven.colors.services.BluePrinter;
import com.maven.colors.services.ColorPrinter;
import com.maven.colors.services.GreenPrinter;
import com.maven.colors.services.RedPrinter;

public class ColorPrinterImpl implements ColorPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {

        // ! Without the DI
        // this.redPrinter = new EnglishRedPrinter();
        // this.bluePrinter = new EnglishBluePrinter();
        // this.greenPrinter = new EnglishGreenPrinter();

        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
