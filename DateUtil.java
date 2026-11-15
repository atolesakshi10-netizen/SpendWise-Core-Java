package com.spendwise.util;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeParseException;

public final class DateUtil {
    private DateUtil() { }
    public static LocalDate parseDate(String value) throws DateTimeParseException {
        return LocalDate.parse(value);
    }
    public static YearMonth currentMonth() { return YearMonth.now(); }
}
