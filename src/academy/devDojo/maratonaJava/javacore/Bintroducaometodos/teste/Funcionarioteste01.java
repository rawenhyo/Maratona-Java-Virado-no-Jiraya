package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.teste;

import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Funcionarioteste01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Robson");
        funcionario01.setIdade(23);
        funcionario01.setSalarios(new double[]{100, 100, 100});
        funcionario01.imprime();





    }
}
