package com.example.dddbasedemo.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class DateUtil {
    public final String DATE_FORMAT = "dd/MM/yyyy";
    public final String RESPONSE_DATE_FORMAT = "yyyy-MM-dd";

    public LocalDate convertDateResponseToLocalDate(String dateStr, String pattern) {
        if (!Util.isBlank(dateStr)) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

            return LocalDate.parse(dateStr, formatter);
        }

        return null;
    }

    public String convertLocalDateToString(LocalDate date, String pattern) {
        if (date != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

            return date.format(formatter);
        }

        return "";
    }
}
