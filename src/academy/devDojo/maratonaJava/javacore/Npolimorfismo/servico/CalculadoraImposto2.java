package academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Produto;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

import java.sql.SQLOutput;

public class CalculadoraImposto2 {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Teclado) {
            Teclado teclado = (Teclado) produto;
            System.out.println("Quantidade de teclas: " + teclado.getQUANTIDADe_DE_TECLAS());
        }


    }
}
