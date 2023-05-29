package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.teste;

import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.Pessoa;

public class pessoateste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(14);
        pessoa.setNome("Rawenhyo");
        pessoa.imprimir();
    }
}
