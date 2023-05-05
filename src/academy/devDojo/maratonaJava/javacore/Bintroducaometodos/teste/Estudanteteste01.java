package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.teste;

import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class Estudanteteste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Robson";
        estudante01.idade = 18;
        estudante01.sexo = 'F';

        estudante02.nome = "Joao";
        estudante02.idade = 13;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

    }
}
