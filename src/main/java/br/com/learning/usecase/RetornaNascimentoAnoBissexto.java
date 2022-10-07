package br.com.learning.usecase;

import br.com.learning.model.Pessoa;

import java.time.Year;

public class RetornaNascimentoAnoBissexto implements UseCase<Pessoa, Boolean> {
    @Override
    public Boolean execute(Pessoa pessoa) {
        return Year.isLeap(pessoa.getDataNascimento().getYear());
    }
}
