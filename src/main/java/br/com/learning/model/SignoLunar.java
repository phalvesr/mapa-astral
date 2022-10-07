package br.com.learning.model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public enum SignoLunar {
    CASIMIRO,
    ODIN,
    GANDALF,
    DINOSSAURO;

    static SignoLunar getAnoLunar(LocalTime horaNascimento, ZoneId idZonaNascimento) {

        if (isNascidoDepoisDoMeioDiaEmRecife(horaNascimento, idZonaNascimento)) {
            return SignoLunar.CASIMIRO;
        } else if (isNascidoAntesDoMeioDiaEmCuiaba(horaNascimento, idZonaNascimento)) {
            return SignoLunar.ODIN;
        } else if (isNascidoEmSaoPaulo(idZonaNascimento)) {
            return SignoLunar.GANDALF;
        } else {
            return SignoLunar.DINOSSAURO;
        }
    }

    private static boolean isNascidoEmSaoPaulo(ZoneId idZonaNascimento) {
        return idZonaNascimento.getId().equals("America/Sao_Paulo");
    }

    private static boolean isNascidoAntesDoMeioDiaEmCuiaba(LocalTime horaNascimento, ZoneId idZonaNascimento) {
        return (horaNascimento.isBefore(LocalTime.NOON)
                && idZonaNascimento.getId().equals("America/Cuiaba"));
    }

    private static boolean isNascidoDepoisDoMeioDiaEmRecife(LocalTime dataNascimento, ZoneId idZonaNascimento) {
        return (dataNascimento.isAfter(LocalTime.NOON)
                && idZonaNascimento.getId().equals("America/Recife"));
    }
}
