package academy.devDojo.maratonaJava.javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Jogador;

public class jogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pelé");
        Jogador jogador02 = new Jogador("Romário");
        Jogador jogador03 = new Jogador("Cafú");
        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
