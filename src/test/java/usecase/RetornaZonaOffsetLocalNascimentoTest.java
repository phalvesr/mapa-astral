package usecase;

import br.com.learning.model.Pessoa;
import br.com.learning.usecase.RetornaZonaOffsetLocalNascimento;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetornaZonaOffsetLocalNascimentoTest {

    RetornaZonaOffsetLocalNascimento sut = new RetornaZonaOffsetLocalNascimento();

    @Test
    public void retornaZoneOffsetParaSaoPauloSP() {

        final var LOCAL_NASCIMENTO_SAO_PAULO = "America/Sao_Paulo";
        final var DATA_NASCIMENTO = LocalDateTime.parse("2000-04-20T00:00:00.000000000");
        final var NOME = "John Doe";


        var pessoa = new Pessoa(NOME, DATA_NASCIMENTO, LOCAL_NASCIMENTO_SAO_PAULO);
        var result = sut.execute(pessoa);


        assertEquals(ZoneId.of(LOCAL_NASCIMENTO_SAO_PAULO).getRules().getOffset(DATA_NASCIMENTO), result);
        assertEquals("-03:00", result.toString());
    }
}
