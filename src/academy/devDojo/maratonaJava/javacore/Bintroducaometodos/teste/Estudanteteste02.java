package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.teste;

import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class Estudanteteste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Robson";
        estudante01.idade = 18;
        estudante01.sexo = 'F';

        estudante02.nome = "Joao";
        estudante02.idade = 13;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
