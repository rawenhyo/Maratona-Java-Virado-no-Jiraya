package academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio;

public class Teclado extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Teclado(String nome, double valor) {
        super(nome, valor);
    }
    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
