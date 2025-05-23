package com.fiverr.veriffication.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CardFormatter {

    public static String formatCreatedAt(LocalDateTime createdAt) {
        if (createdAt == null) return "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h.mma EEEE", Locale.ENGLISH);
        // Example output: "12.00PM Thursday"

        // To get "12.00pm" lowercase 'pm', just lowercase the AM/PM part:
        return formatter.format(createdAt).toLowerCase();
    }
}
