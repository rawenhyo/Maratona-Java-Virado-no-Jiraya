package academy.devDojo.maratonaJava.javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Jogador;
import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Time;

public class jogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Gabigol");
        Time time = new Time("Flamengo");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}
