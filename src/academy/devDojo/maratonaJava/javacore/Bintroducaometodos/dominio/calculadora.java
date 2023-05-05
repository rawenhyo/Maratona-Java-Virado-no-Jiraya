package academy.devDojo.maratonaJava.javacore.Bintroducaometodos.dominio;

public class calculadora {

    public void somaNumeors() {
        int soma = 10 + 10;
        System.out.printf("A soma dos numeros é: " + soma);
    }

    public void subtraiNumeros() {
        int subtracao = 10-10;
        System.out.printf("A subtracao dos numeros é: " + subtracao);
    }


    public void multiplicacao(int num1, int num2){

        int multiplicacao = num1*num2;

        System.out.printf("A multiplicação dos numeros é: " + multiplicacao);
    }
    public double divideDoisNumeros(double num1, double num2){
        double divisao = num1/num2;
        return divisao;
    }
}
