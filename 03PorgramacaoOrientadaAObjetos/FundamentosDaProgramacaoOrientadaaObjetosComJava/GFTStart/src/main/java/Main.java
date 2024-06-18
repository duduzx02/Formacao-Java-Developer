import dio.digital.Bootcamp;
import dio.digital.Curso;
import dio.digital.Dev;
import dio.digital.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso de Java");
        cursoJava.setDescricao("Curso básico de Java");
        cursoJava.setCargaHoraria(8);


        Curso cursoDotNet= new Curso();
        cursoJava.setTitulo("java .net");
        cursoJava.setDescricao("Curso básico de C#");
        cursoJava.setCargaHoraria(8);

        Curso cursoKotlin = new Curso();
        cursoJava.setTitulo("Curso de Kotlin");
        cursoJava.setDescricao("Curso básico de Kotlin");
        cursoJava.setCargaHoraria(12);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("POO(Programação orientada a objetos.)");
        mentoriaJava.setDescricao("Imersão sobre os pilares da Orientação a objetos.");
        mentoriaJava.setData(LocalDateTime.now());

        Bootcamp bootcampJava = new Bootcamp("Formação java", LocalDate.of(2023,10, 30)
        , LocalDate.of(2023,12,30), Arrays.asList(cursoJava, mentoriaJava, cursoKotlin));


        Dev eduardo = new Dev();
        eduardo.setNome("Eduardo");

        Dev dudu = new Dev();
        dudu.setNome("Dudu");

        eduardo.inscrever(bootcampJava);
        eduardo.progredir();


        dudu.inscrever(cursoDotNet);
        dudu.inscrever(mentoriaJava);
        dudu.inscrever(bootcampJava);

        dudu.progredir();
        dudu.progredir();
        dudu.progredir();
        dudu.progredir();



        System.out.println(eduardo.getConteudosInscrito());
        System.out.println(dudu.getConteudosInscrito());
        System.out.println(dudu.calcularTotalXp());
        System.out.println(eduardo.calcularTotalXp());

        List<Dev> ranking =
                Arrays.asList(dudu, eduardo).stream().sorted((dev1, dev2) -> Double.compare(dev2.calcularTotalXp(),
                        dev1.calcularTotalXp())).collect(Collectors.toList());

        for (Dev dev: ranking) {
            System.out.println(dev.getNome());
        }

    }

}
