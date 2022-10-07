package br.com.learning.model;

import java.time.LocalTime;

public enum Ascendente {
    NAO_IMPLEMENTADO,
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

    // TODO
    static Ascendente getAscendente(Pessoa pessoa) {

        var signo = pessoa.getSignoZodiaco();
        var horarioDeNascimento = pessoa.getDataNascimento().toLocalTime();

        if (Signo.ARIES == signo) {
            if (isWithinRange(horarioDeNascimento, LocalTime.of(18, 31), LocalTime.of(20, 30))) {
                return Ascendente.ESCORPIAO;
            }
        } else if (Signo.SAGITARIO == signo) {
            if (isWithinRange(horarioDeNascimento, LocalTime.of(10, 31), LocalTime.of(12, 30))) {
                return Ascendente.PEIXES;
            }
        }
        return NAO_IMPLEMENTADO;
    }

    private static boolean isWithinRange(LocalTime horarioDeNascimento, LocalTime startTime, LocalTime endTime) {
        return !(horarioDeNascimento.isBefore(startTime) || horarioDeNascimento.isAfter(endTime));
    }
}
