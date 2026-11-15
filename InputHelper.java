package com.spendwise.util;

import java.util.Scanner;

public final class InputHelper {
    private InputHelper() { }
    public static String readText(Scanner scanner, String prompt) {
        System.out.print(prompt); return scanner.nextLine().trim();
    }
    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try { return Integer.parseInt(scanner.nextLine().trim()); }
            catch (NumberFormatException ex) { System.out.println("Enter a whole number."); }
        }
    }
    public static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                double value = Double.parseDouble(scanner.nextLine().trim());
                if (value > 0) return value;
                System.out.println("Amount must be greater than zero.");
            } catch (NumberFormatException ex) { System.out.println("Enter a valid amount."); }
        }
    }
}
