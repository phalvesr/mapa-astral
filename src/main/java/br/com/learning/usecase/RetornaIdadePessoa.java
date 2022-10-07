package br.com.learning.usecase;

import br.com.learning.provider.DateTimeProvider;

import java.time.LocalDateTime;
import java.time.Period;

public class RetornaIdadePessoa implements UseCase<LocalDateTime, Integer> {

    private final DateTimeProvider dateTimeProvider;

    public RetornaIdadePessoa(DateTimeProvider dateTimeProvider) {
        this.dateTimeProvider = dateTimeProvider;
    }

    @Override
    public Integer execute(LocalDateTime dataNascimento) {
        return Period.between(dataNascimento.toLocalDate(), dateTimeProvider.getLocalDateNow()).getYears();
    }
}
