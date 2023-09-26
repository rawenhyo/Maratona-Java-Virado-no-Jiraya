package academy.devDojo.maratonaJava.javacore.Npolimorfismo.teste;

import academy.devDojo.maratonaJava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.repositorioArquivo;
import academy.devDojo.maratonaJava.javacore.Npolimorfismo.servico.repositorioMemoria;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new repositorioMemoria();
        repositorio.salvar();
    }
}
