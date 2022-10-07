package br.com.learning.usecase;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RetornaDataFormatada implements UseCase<LocalDateTime, String> {

    @Override
    public String execute(LocalDateTime data) {
        final var FORMATTER_DIA_MES_ANO_HORA_MINUTO = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        return data.format(FORMATTER_DIA_MES_ANO_HORA_MINUTO);
    }
}
