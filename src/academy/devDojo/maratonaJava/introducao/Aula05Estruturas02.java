package academy.devDojo.maratonaJava.introducao;

public class Aula05Estruturas02 {
    public static void main(String[] args) {
        int idade = 12;
        String categoria;
        if (idade<=15){
            categoria = "Categoria infantil";
        }else if (idade >=15 && idade <=17){
            categoria = "Categoria junivel";
        }else{
            categoria = "Categoria adulta";
        }
        System.out.println(categoria);
    }
}
