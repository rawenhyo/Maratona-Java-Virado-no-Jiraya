package academy.devDojo.maratonaJava.javacore.Npolimorfismo.teste;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto.calcularImpostoComputador;
import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto.calcularImpostoteclado;

public class Produtoteste01 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Razer", 300);
        Computador computador = new Computador("Asus", 5000);
        calcularImpostoteclado(teclado);
        System.out.println("--------");
        calcularImpostoComputador(computador);
    }
}
