package br.com.learning.model;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Pessoa {
    private final String nome;
    private final LocalDateTime dataNascimento;
    private final ZoneId localNascimentoZoneId;
    private final String nomeLocalNascimento;
    private final Signo signoZodiaco;
    private final SignoLunar signoLunar;
    private final Ascendente ascendente;

    public Pessoa(String nome, LocalDateTime dataNascimento, String nomeLocalNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.localNascimentoZoneId = ZoneId.of(nomeLocalNascimento);
        this.nomeLocalNascimento = nomeLocalNascimento;
        this.signoZodiaco = Signo.getSignoPorData(dataNascimento.toLocalDate());
        this.signoLunar = SignoLunar.getAnoLunar(dataNascimento.toLocalTime(), localNascimentoZoneId);
        this.ascendente = Ascendente.getAscendente(this);
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public ZoneId getLocalNascimentoZoneId() {
        return localNascimentoZoneId;
    }

    public String getNomeLocalNascimento() {
        return nomeLocalNascimento;
    }

    public Signo getSignoZodiaco() {
        return signoZodiaco;
    }

    public SignoLunar getSignoLunar() {
        return signoLunar;
    }

    public Ascendente getAscendente() {
        return ascendente;
    }
}
