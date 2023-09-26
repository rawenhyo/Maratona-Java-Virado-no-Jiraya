package academy.devDojo.maratonaJava.javacore.Lcalssesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    protected  abstract void calculabonus();

    public Funcionario(String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
        calculabonus();
    }


}
