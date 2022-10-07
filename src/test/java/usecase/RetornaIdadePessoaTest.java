package usecase;

import br.com.learning.usecase.RetornaIdadePessoa;
import org.junit.jupiter.api.Test;
import br.com.learning.provider.DateTimeProvider;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class RetornaIdadePessoaTest {



    @Test
    public void  deveRetornarIdadeDaPessoaEmComparacaoComADataAtual() {

        final var DATA_NASCIMENTO = LocalDateTime.parse("2013-07-12T00:00:00.000000000");
        var dateTimeProvider = mock(DateTimeProvider.class);
        when(dateTimeProvider.getLocalDateNow()).thenReturn(LocalDate.parse("2023-07-12"));


        var sut = new RetornaIdadePessoa(dateTimeProvider);
        var result = sut.execute(DATA_NASCIMENTO);


        assertEquals(10, result);
    }
}
