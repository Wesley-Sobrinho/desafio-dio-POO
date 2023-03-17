package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {

    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        setDescricao(descricao);
        setTitulo(titulo);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso { título = " + getTitulo() + ", descrição = " + getDescricao() + ", carga Horaria = "
                + cargaHoraria + " horas}";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}