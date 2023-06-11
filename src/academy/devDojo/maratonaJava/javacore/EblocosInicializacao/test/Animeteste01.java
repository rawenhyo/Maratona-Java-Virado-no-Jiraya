package academy.devDojo.maratonaJava.javacore.EblocosInicializacao.test;

import academy.devDojo.maratonaJava.javacore.EblocosInicializacao.dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
        Anime anime01 = new Anime();

        for (int episodio : anime01.getEpisodios()) {
            System.out.print(episodio);
        }
    }
}
