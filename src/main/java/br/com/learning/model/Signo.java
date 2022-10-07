package br.com.learning.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.SortedMap;

public enum Signo {
    ARIES,
    TOURO,
    GEMEOS,
    CANCER,
    LEAO,
    VIRGEM,
    LIBRA,
    ESCORPIAO,
    SAGITARIO,
    CAPRICORNIO,
    AQUARIO,
    PEIXES;

    static Signo getSignoPorData(LocalDate data) {
        var month = Month.from(data);
        var dayOfMonth = MonthDay.from(data).getDayOfMonth();

        if (month == Month.JANUARY) {
            if (dayOfMonth < 20) {
                return Signo.CAPRICORNIO;
            } else {
                return Signo.AQUARIO;
            }
        } else if (month == Month.FEBRUARY) {
            if (dayOfMonth < 19) {
                return Signo.AQUARIO;
            } else {
                return Signo.PEIXES;
            }
        } else if (month == Month.MARCH) {
            if (dayOfMonth < 21) {
                return Signo.PEIXES;
            } else {
                return Signo.ARIES;
            }
        } else if (month == Month.APRIL) {
            if (dayOfMonth < 20) {
                return Signo.ARIES;
            } else {
                return Signo.TOURO;
            }
        } else if (month == Month.MAY) {
            if (dayOfMonth < 21) {
                return Signo.TOURO;
            } else {
                return Signo.GEMEOS;
            }
        } else if (month == Month.JUNE) {
            if (dayOfMonth < 21) {
                return Signo.GEMEOS;
            } else {
                return Signo.CANCER;
            }
        } else if (month == Month.JULY) {
            if (dayOfMonth < 23) {
                return Signo.CANCER;
            } else {
                return Signo.LEAO;
            }
        } else if (month == Month.AUGUST) {
            if (dayOfMonth < 23) {

                return Signo.LEAO;
            } else {
                return Signo.VIRGEM;
            }
        } else if (month == Month.SEPTEMBER) {
            if (dayOfMonth < 23) {
                return Signo.VIRGEM;
            } else {
                return Signo.LIBRA;
            }
        } else if (month == Month.OCTOBER) {
            if (dayOfMonth < 23) {
                return Signo.LIBRA;
            } else {
                return Signo.ESCORPIAO;
            }
        } else if (month == Month.NOVEMBER) {
            if (dayOfMonth < 22) {
                return Signo.ESCORPIAO;
            } else {
                return Signo.SAGITARIO;
            }
        } else if (month == Month.DECEMBER) {
            if (dayOfMonth < 22) {
                return Signo.SAGITARIO;
            } else {
                return Signo.CAPRICORNIO;
            }
        }

        throw new IllegalArgumentException("data");
    }
}
