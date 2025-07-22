import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso python");
        curso2.setDescricao("descricao curso python");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria em java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

//        System.out.println(mentoria);
//        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devVinicius = new Dev();
        devVinicius.setNome("Vinicius");
        devVinicius.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Vinicius: " + devVinicius.getConteudosInscritos());
        devVinicius.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos Vinicius: " + devVinicius.getConteudosInscritos());
        System.out.println("Conteudos concluidos Vinicius: " + devVinicius.getConteudosConcluidos());
        System.out.println("XP: " + devVinicius.calcularTotalXp());
        System.out.println("-----");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("----------------");
        devJoao.progredir();
        System.out.println("Conteudos inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao: " + devJoao .getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
    }
}