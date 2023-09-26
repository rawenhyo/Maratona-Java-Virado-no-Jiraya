package academy.devDojo.maratonaJava.exercicioSeminario.test;


import academy.devDojo.maratonaJava.exercicioSeminario.dominio.aluno;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.local;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.professor;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.seminario;

public class testeseminario02 {
    public static void main(String[] args) {
        seminario seminario01 = new seminario("Roupa nova");
        local local = new local("rua joaozin, 123");
        aluno aluno = new aluno("joaozin", 13);
        professor professor = new professor("Jooa1", "ingles");
        aluno[] alunosparaseminario = {aluno};
        seminario seminario = new seminario("joaozin", alunosparaseminario, local);

    }
}
