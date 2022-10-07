package model;

import br.com.learning.model.Ascendente;
import br.com.learning.model.Pessoa;
import br.com.learning.model.Signo;
import br.com.learning.model.SignoLunar;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PessoaTest {

    @ParameterizedTest
    @MethodSource("dataNascimentoSignoSource")
    public void retornaSignoZodiacoPessoaConformeEsperado(String dataNascimentoStr, String signoEsperado) {

        var sut = new Pessoa("John Doe", LocalDateTime.parse(dataNascimentoStr), "America/Sao_Paulo");


        var result = sut.getSignoZodiaco();


        assertEquals(Signo.valueOf(signoEsperado), result);
    }

    @ParameterizedTest
    @MethodSource("signoLunar")
    public void retornaSignoLunarPessoaConformeEsperado(String zoneIdStr, String dataNascimentoStr, String signoEsperado) {

        var sut = new Pessoa("John Doe", LocalDateTime.parse(dataNascimentoStr), zoneIdStr);


        var result = sut.getSignoLunar();


        assertEquals(SignoLunar.valueOf(signoEsperado), result);
    }

    @ParameterizedTest
    @MethodSource("ascendenteSource")
    public void retornaAscendentePessoaConformeEsperado(String dataNascimento, String ascendenteEsperado) {

        var sut = new Pessoa("John Doe", LocalDateTime.parse(dataNascimento), "America/Sao_Paulo");


        var result = sut.getAscendente();


        assertEquals(Ascendente.valueOf(ascendenteEsperado), result);
    }

    private static Stream<Arguments> dataNascimentoSignoSource() {
        return Stream.of(
                arguments("2030-03-21T00:00:00.000000000", "ARIES"),
                arguments("2030-04-19T00:00:00.000000000", "ARIES"),
                arguments("2030-04-21T00:00:00.000000000", "TOURO"),
                arguments("2030-05-20T00:00:00.000000000", "TOURO"),
                arguments("2030-05-21T00:00:00.000000000", "GEMEOS"),
                arguments("2030-06-20T00:00:00.000000000", "GEMEOS"),
                arguments("2030-06-21T00:00:00.000000000", "CANCER"),
                arguments("2030-07-22T00:00:00.000000000", "CANCER"),
                arguments("2030-07-23T00:00:00.000000000", "LEAO"),
                arguments("2030-08-22T00:00:00.000000000", "LEAO"),
                arguments("2030-08-23T00:00:00.000000000", "VIRGEM"),
                arguments("2030-09-22T00:00:00.000000000", "VIRGEM"),
                arguments("2030-09-23T00:00:00.000000000", "LIBRA"),
                arguments("2030-10-22T00:00:00.000000000", "LIBRA"),
                arguments("2030-10-23T00:00:00.000000000", "ESCORPIAO"),
                arguments("2030-11-21T00:00:00.000000000", "ESCORPIAO"),
                arguments("2030-11-22T00:00:00.000000000", "SAGITARIO"),
                arguments("2030-12-21T00:00:00.000000000", "SAGITARIO"),
                arguments("2030-12-23T00:00:00.000000000", "CAPRICORNIO"),
                arguments("2030-01-19T00:00:00.000000000", "CAPRICORNIO"),
                arguments("2030-01-23T00:00:00.000000000", "AQUARIO"),
                arguments("2030-02-17T00:00:00.000000000", "AQUARIO"),
                arguments("2030-02-20T00:00:00.000000000", "PEIXES"),
                arguments("2030-03-20T00:00:00.000000000", "PEIXES")
        );
    }

    private static Stream<Arguments> signoLunar() {
        return Stream.of(
            arguments("America/Recife", "2030-03-21T12:01:00.000000000", "CASIMIRO"),
            arguments("America/Cuiaba", "2030-03-21T11:59:00.000000000", "ODIN"),
            arguments("America/Sao_Paulo", "2030-03-21T11:59:00.000000000", "GANDALF"),
            arguments("America/Sao_Paulo", "2030-03-21T12:01:00.000000000", "GANDALF"),
            arguments("America/Toronto", "2030-03-21T12:01:00.000000000", "DINOSSAURO"),
            arguments("America/Toronto", "2030-03-21T11:59:00.000000000", "DINOSSAURO")
        );
    }

    private static Stream<Arguments> ascendenteSource() {
        return Stream.of(
            arguments("2000-03-25T19:30:00.000000000", "ESCORPIAO"),
            arguments("2000-11-24T12:29:00.000000000", "PEIXES"),
            arguments("2000-06-30T06:00:00.000000000", "NAO_IMPLEMENTADO")
        );
    }
}
