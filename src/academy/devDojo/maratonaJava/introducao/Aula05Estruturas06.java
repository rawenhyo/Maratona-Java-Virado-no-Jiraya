package academy.devDojo.maratonaJava.introducao;

public class Aula05Estruturas06 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Hoje é um dia útil");
                break;
            default:
                System.out.println("Opção invalida.");
                break;
        }
    }
}
