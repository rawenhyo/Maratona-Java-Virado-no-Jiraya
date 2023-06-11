package academy.devDojo.maratonaJava.exercicioSeminario.test;

import academy.devDojo.maratonaJava.exercicioSeminario.dominio.aluno;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.local;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.professor;
import academy.devDojo.maratonaJava.exercicioSeminario.dominio.seminario;

import java.util.Scanner;

public class testseminario01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            opcao = 0;
            System.out.println("Digite algum dos numeros abaixo para escolher uma opção:");
            System.out.println("Digite 1 para cadastrar um seminario.");
            System.out.println("Digite 2 para cadastrar um aluno.");
            System.out.println("Digite 3 para cadastrar um professor.");
            System.out.println("Digite 4 para cadastrar um local.");
            System.out.println("Digite 0 para encerrar o programa.");
            System.out.println();
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    break;
                case 1:
                    System.out.println("Insira o Titulo do seminário:");
//                    String titulo = entrada.next();
                    seminario seminario01 = new seminario(entrada.next());
//                    System.out.println("Deseja inserir outras informações?");
//                    String resposta = entrada.next();
//                    if(resposta=="s"){
//                        seminario01.set
//                    }
                    break;
                case 2:
                    System.out.println("Insira o nome do aluno e sua idade:");
                    String nomeAluno = entrada.next();
                    int idade = entrada.nextInt();
                    aluno aluno01 = new aluno(nomeAluno, idade);
                    break;
                case 3:
                    System.out.println("Insira o nome do professor e sua especialidade:");
                    String nomeProfessor = entrada.next();
                    String especialidade = entrada.next();
                    professor professor01 = new professor(nomeProfessor, especialidade);
                    break;
                case 4:
                    System.out.println("Insira o endereço do local:");
                    String endereco = entrada.next();
                    local local01 = new local(endereco);
                    break;
                default:
                    System.out.println("Você digitou uma opção invalida, tente novamente!");
                    break;
            }
        } while (opcao != 0);
        System.out.println("o programa foi encerrado.");
    }
}
