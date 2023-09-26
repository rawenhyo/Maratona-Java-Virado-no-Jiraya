package academy.devDojo.maratonaJava.javacore.Npolimorfismo.dominio;

public class Teclado extends Produto {

    private int QUANTIDADe_DE_TECLAS;
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public Teclado(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public int getQUANTIDADe_DE_TECLAS() {
        return QUANTIDADe_DE_TECLAS;
    }

    public void setQUANTIDADe_DE_TECLAS(int QUANTIDADe_DE_TECLAS) {
        this.QUANTIDADe_DE_TECLAS = QUANTIDADe_DE_TECLAS;
    }
}
