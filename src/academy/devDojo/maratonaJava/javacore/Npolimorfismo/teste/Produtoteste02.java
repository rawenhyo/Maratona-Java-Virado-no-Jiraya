package academy.devDojo.maratonaJava.javacore.Npolimorfismo.teste;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

public class Produtoteste02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Razer", 4000);
        Produto produto2 = new Teclado("xpg", 300);
        System.out.println("Computador: " + produto1.getNome());
        System.out.println("Valor: " + produto1.getValor());
        System.out.println("Imposto: " + produto1.calcularImposto());
        System.out.println("-------------------");
        System.out.println("Teclado: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println("Imposto: " + produto2.calcularImposto());
    }
}
