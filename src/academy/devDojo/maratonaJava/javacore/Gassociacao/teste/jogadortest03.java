package academy.devDojo.maratonaJava.javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Jogador;
import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Time;

public class jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Gabigol");
        Jogador jogador02 = new Jogador("Arrascaeta");
        Time time = new Time("Flamengo");

        jogador01.setTime(time);
        jogador02.setTime(time);

        Jogador[] jogadores = {jogador01, jogador02};

        time.setJogadores(jogadores);

        System.out.println("--- Jogadores ---");
        jogador01.imprime();
        jogador02.imprime();

        System.out.println("--- Time ---");
        time.imprime();

    }
}
