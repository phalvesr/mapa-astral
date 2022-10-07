package usecase;

import br.com.learning.usecase.RetornaDataFormatada;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetornaDataFormatadaTest {

    private RetornaDataFormatada sut = new RetornaDataFormatada();

    @Test
    @DisplayName("Verifica data no formato dd/MM/yyyy HH:mm (exemplo: 06/10/2022 12:00)")
    public void deveRetornarDataFormatadaNoPadraoDiaMesAnoHoraMinuto() {

        final var DATA_TESTE = LocalDateTime.parse("2022-10-06T12:00:00.000000000");

        var result = sut.execute(DATA_TESTE);

        assertEquals("06/10/2022 12:00", result);
    }
}
