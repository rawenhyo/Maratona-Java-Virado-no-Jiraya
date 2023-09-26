package academy.devDojo.maratonaJava.javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipocliente;

    public Cliente(String nome, TipoCliente tipocliente) {
        this.nome = nome;
        this.tipocliente = tipocliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipocliente() {
        return tipocliente;
    }

    public void setTipocliente(TipoCliente tipocliente) {
        this.tipocliente = tipocliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipocliente=" + tipocliente +
                ", tipoclienteINT=" + tipocliente.getVALOR() +
                '}';
    }
}
