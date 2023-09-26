package academy.devDojo.maratonaJava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    private final int VALOR;
    TipoCliente(int VALOR) {
        this.VALOR = VALOR;
    }

    public int getVALOR() {
        return VALOR;
    }
}
