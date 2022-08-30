package ru.job4j.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Formatter;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("work"));
        System.setOut(ps);
        System.out.println("Hello World!");

    }
}
