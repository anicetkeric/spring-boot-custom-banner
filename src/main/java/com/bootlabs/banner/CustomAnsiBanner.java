package com.bootlabs.banner;

import org.springframework.boot.Banner;
import org.springframework.core.env.Environment;

import java.io.PrintStream;

public class CustomAnsiBanner implements Banner {

    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
        // ANSI escape codes for colors
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String brightBlue = "\u001B[1;34m"; // Bright blue
        String yellow = "\u001B[33m";
        String reset = "\u001B[0m";

        // Custom banner text
        out.println(red + "______     ______     ______   .___________. " + green + "  .___________. _______   ______  __    __" + reset);
        out.println(red + "|   _  \\   /  __  \\   /  __  \\  |           | " + green + "  |           ||   ____| /      ||  |  |  |" + reset);
        out.println(red + "|  |_)  | |  |  |  | |  |  |  | `---|  |----` " + green + "  `---|  |----`|  |__   |  ,----'|  |__|  |" + reset);
        out.println(red + "|   _  <  |  |  |  | |  |  |  |     |  |      " + green + "      |  |     |   __|  |  |     |   __   |" + reset);
        out.println(red + "|  |_)  | |  `--'  | |  `--'  |     |  |      " + green + "      |  |     |  |____ |  `----.|  |  |  |" + reset);
        out.println(red + "|______/   \\______/   \\______/      |__|      " + green + "      |__|     |_______| \\______||__|  |__|" + reset);
        out.println(blue + "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo" + reset);
        out.println(brightBlue + "                :: Welcome to My Spring Boot Application!" + reset);
        out.println(green + "                     ::        Have a wonderful day! 🌷" + reset);
        out.println(yellow + "                  Powered by Spring Boot " + environment.getProperty("spring-boot.version") + " ::" + reset);
    }
}