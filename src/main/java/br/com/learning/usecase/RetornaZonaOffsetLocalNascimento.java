package br.com.learning.usecase;

import br.com.learning.model.Pessoa;

import java.time.ZoneOffset;

public class RetornaZonaOffsetLocalNascimento implements UseCase<Pessoa, ZoneOffset> {

    @Override
    public ZoneOffset execute(Pessoa pessoa) {
        return pessoa.getLocalNascimentoZoneId().getRules().getOffset(pessoa.getDataNascimento());
    }
}
