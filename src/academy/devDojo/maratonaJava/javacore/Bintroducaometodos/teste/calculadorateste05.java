package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.teste;

import academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio.calculadora;

public class calculadorateste05 {
    public static void main(String[] args) {
        calculadora Calculadora = new calculadora();
        int[] numeros = {1,3,4,5,6,};
        Calculadora.somaArray(numeros);
        Calculadora.somaVarArgs(numeros);

    }
}