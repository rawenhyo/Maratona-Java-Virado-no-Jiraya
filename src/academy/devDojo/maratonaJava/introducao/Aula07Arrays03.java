package academy.devDojo.maratonaJava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = {0,1,2,3,4};

        for (int i = 0; i <numeros.length ; i++) {
            System.out.println(numeros[i]);

        }
        for (int num:numeros) {
            System.out.println(num);
        }
    }
}
