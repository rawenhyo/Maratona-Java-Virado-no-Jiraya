package academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Calculando imposto Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor:" + computador.getValor());
        System.out.println("Valor do imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoteclado(Teclado teclado) {
        System.out.println("Calculando imposto teclado");
        double imposto = teclado.calcularImposto();
        System.out.println("teclado: " + teclado.getNome());
        System.out.println("Valor:" + teclado.getValor());
        System.out.println("Valor do imposto a ser pago: " + imposto);
    }
}
