package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {

    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        setDescricao(descricao);
        setTitulo(titulo);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Metoria {titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", data = "
                + data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)) + "}";
    }

}
