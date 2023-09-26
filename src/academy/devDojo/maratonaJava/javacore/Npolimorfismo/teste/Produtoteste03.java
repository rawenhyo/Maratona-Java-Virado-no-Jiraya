package academy.devDojo.maratonaJava.javacore.Npolimorfismo.teste;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Computador;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio.Teclado;

import static academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.CalculadoraImposto2.calcularImposto;

public class Produtoteste03 {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("Razer", 300);
        Computador computador = new Computador("Asus", 5000);
        teclado.setQUANTIDADe_DE_TECLAS(29);
        calcularImposto(computador);
        System.out.println("--------");
        calcularImposto(teclado);
    }
}