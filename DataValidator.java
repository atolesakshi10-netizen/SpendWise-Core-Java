package com.spendwise.util;

public final class DataValidator {
    private DataValidator() { }
    public static boolean isNotBlank(String value) {
        return value != null && !value.trim().isEmpty();
    }
    public static boolean isPositive(double value) { return value > 0; }
}
