package academy.devDojo.maratonaJava.javacore.Npolimorfismo.teste;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto.calcularImpostoComputador;
import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto.calcularImpostoteclado;
import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto2.calcularImposto;

public class Produtoteste01_Imposto2 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Razer", 300);
        Computador computador = new Computador("Asus", 5000);
        calcularImposto(computador);
        System.out.println("--------");
        calcularImposto(teclado);
    }
}
