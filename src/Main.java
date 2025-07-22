import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso curso1 = new Curso();
        System.out.println("Insira o nome do curso");
        curso1.setTitulo(scanner.nextLine());
        System.out.println("Insira a descrição do curso");
        curso1.setDescricao(scanner.nextLine());
        System.out.println("Insira a carga horaria do curso");
        curso1.setCargaHoraria(scanner.nextInt());

        scanner.nextLine(); //limpa o buffer
        System.out.println("---");

        Curso curso2 = new Curso();
        System.out.println("Insira o nome do curso");
        curso2.setTitulo(scanner.nextLine());
        System.out.println("Insira a descrição do curso");
        curso2.setDescricao(scanner.nextLine());
        System.out.println("Insira a carga horaria do curso");
        curso2.setCargaHoraria(scanner.nextInt());

        scanner.nextLine(); //limpa o buffer
        System.out.println("---");

        Mentoria mentoria = new Mentoria();
        System.out.println("Insira o titulo da mentoria");
        mentoria.setTitulo(scanner.nextLine());
        System.out.println("Insira uma descrição para a mentoria");
        mentoria.setDescricao("Insira a descriçãoo da mentoria");
        mentoria.setDescricao(scanner.nextLine());
        mentoria.setData(LocalDate.now());

        System.out.println("---");

        Bootcamp bootcamp = new Bootcamp();
        System.out.println("Insira um nome para o bootcamp");
        bootcamp.setNome(scanner.nextLine());
        System.out.println("Insira uma descrição para o bootcamp");
        bootcamp.setDescricao(scanner.nextLine());
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("---");

        Dev dev1 = new Dev();
        System.out.println("Insira o nome do dev que fará o curso");
        dev1.setNome(scanner.nextLine());
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("----------------");
        System.out.println("Conteúdos inscritos de " + dev1.getNome() + ": " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev1.getNome() + ": " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("-----");

        Dev dev2 = new Dev();
        System.out.println("Insira o nome do dev que fará o curso");
        dev2.setNome(scanner.nextLine());
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("----------------");
        dev2.progredir();
        System.out.println("Conteúdos inscritos de " + dev2.getNome() + ": " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + dev2.getNome() + ": " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
