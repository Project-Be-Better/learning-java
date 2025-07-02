package com.maven.colors.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.maven.colors.services.BluePrinter;
import com.maven.colors.services.ColorPrinter;
import com.maven.colors.services.GreenPrinter;
import com.maven.colors.services.RedPrinter;
import com.maven.colors.services.impl.ColorPrinterImpl;
import com.maven.colors.services.impl.SpanishBluePrinter;
import com.maven.colors.services.impl.SpanishGreenPrinter;
import com.maven.colors.services.impl.SpanishRedPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        return new ColorPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }

}
