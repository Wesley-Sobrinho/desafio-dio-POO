import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("curso Java", "POO em java", 140);
        Curso curso2 = new Curso("curso de JavaScript ", "JavaScript do basico ao avançado", 210);

        Mentoria mentoria = new Mentoria("mentoria Java", "Mentoria de Programação para Java Orientado a Objetos",
                LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao(" Bootcamp Dev Júnior prático para introdução a uma carreira em desenvolvimento de software.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println(
                "-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-\n");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosIncritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calculartotalXp());

        System.out.println(
                "-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-\n");

        Dev AnaPaula = new Dev();
        AnaPaula.setNome("Ana Paula");
        AnaPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana Paula:" + AnaPaula.getConteudosIncritos());
        AnaPaula.progredir();
        AnaPaula.progredir();
        AnaPaula.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana Paula:" + AnaPaula.getConteudosIncritos());
        System.out.println("Conteúdos Concluidos Ana Paula:" + AnaPaula.getConteudosConcluidos());
        System.out.println("XP:" + AnaPaula.calculartotalXp());

    }
}
