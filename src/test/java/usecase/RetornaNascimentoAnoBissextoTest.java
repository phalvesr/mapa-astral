package usecase;

import br.com.learning.model.Pessoa;
import br.com.learning.usecase.RetornaNascimentoAnoBissexto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class RetornaNascimentoAnoBissextoTest {

    private final RetornaNascimentoAnoBissexto sut = new RetornaNascimentoAnoBissexto();

    @Test
    public void retornaTrueQuandoAnoNascimentoEBissexto() {
        final var DATA_ANO_BISSEXTO = LocalDateTime.parse("2000-01-01T00:00:00.000000000");
        var pessoa = new Pessoa(null, DATA_ANO_BISSEXTO, "America/Sao_Paulo");


        var result = sut.execute(pessoa);


        assertTrue(result, "Em caso de falha, certifique-se que o ano da data passada para a \"DATA_ANO_BISSEXTO\" é realmente um ano bissexto");
    }

    @Test
    public void retornaFalseQuandoAnoNascimentoNaoEBissexto() {
        final var DATA_ANO_NAO_BISSEXTO = LocalDateTime.parse("2001-01-01T00:00:00.000000000");
        var pessoa = new Pessoa(null, DATA_ANO_NAO_BISSEXTO, "America/Sao_Paulo");


        var result = sut.execute(pessoa);


        assertFalse(result, "Em caso de falha, certifique-se que o ano da data passada para a \"DATA_ANO_BISSEXTO\" nãe é um ano bissexto");
    }
}
