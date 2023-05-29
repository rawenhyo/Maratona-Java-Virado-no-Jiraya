package academy.devDojo.maratonaJava.javacore.CsobrecargaMetodos.test;

import academy.devDojo.maratonaJava.javacore.CsobrecargaMetodos.dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
            Anime anime = new Anime();
            anime.init("Naruto", "ação", 18, "legal");
            anime.imprime();
    }
}
