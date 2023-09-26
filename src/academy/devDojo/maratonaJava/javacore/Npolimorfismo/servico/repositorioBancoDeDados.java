package academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class repositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Banco de dados");
    }
}
