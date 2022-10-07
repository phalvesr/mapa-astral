package br.com.learning.provider;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeProvider {

    public LocalDateTime getLocalDateTimeNow() {
        return LocalDateTime.now();
    }

    public LocalDate getLocalDateNow() {
        return LocalDate.now();
    }

}
