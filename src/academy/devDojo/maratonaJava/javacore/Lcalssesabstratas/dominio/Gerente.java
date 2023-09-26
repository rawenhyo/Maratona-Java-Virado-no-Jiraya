package academy.devDojo.maratonaJava.javacore.Lcalssesabstratas.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, int salario) {
        super(nome, salario);
    }

    protected void calculabonus(){
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
