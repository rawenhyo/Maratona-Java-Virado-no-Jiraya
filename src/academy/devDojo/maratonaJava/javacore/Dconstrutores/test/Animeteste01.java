package academy.devDojo.maratonaJava.javacore.Dconstrutores.test;

import academy.devDojo.maratonaJava.javacore.Dconstrutores.dominio.Anime;

public class Animeteste01 {
    public static void main(String[] args) {
            Anime anime = new Anime("Naruto", "ação", 18, "legal", "teste");
//            Anime anime2 = new Anime();
//            anime2.imprime();
//            anime.init("Naruto", "ação", 18, "legal");
            anime.imprime();
    }
}
