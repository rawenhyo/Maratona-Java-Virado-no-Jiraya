package academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;

public class repositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Arquivos");
    }
}
