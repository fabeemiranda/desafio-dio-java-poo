import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria css");
        mentoria.setDescricao("descrição mentoria css");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabiana = new Dev();
        devFabiana.setNome("Fabiana");
        devFabiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fabiana: " + devFabiana.getConteudosInscritos());

        devFabiana.progredir();
        devFabiana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Fabiana: " + devFabiana.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fabiana: " + devFabiana.getConteudosConcluidos());
        System.out.println("XP: " + devFabiana.calcularTotalXp());

        System.out.println("---------------");

        Dev devPietro = new Dev();
        devPietro.setNome("Pietro");
        devPietro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Pietro: " + devPietro.getConteudosInscritos());
        devPietro.progredir();
        devPietro.progredir();
        devPietro.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Pietro: " + devPietro.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Pietro: " + devPietro.getConteudosConcluidos());
        System.out.println("XP: " + devPietro.calcularTotalXp());



    }


}
