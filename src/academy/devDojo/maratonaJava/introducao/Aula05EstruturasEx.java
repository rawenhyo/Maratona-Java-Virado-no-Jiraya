package academy.devDojo.maratonaJava.introducao;

public class Aula05EstruturasEx {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double valorImposto;
        double imposto;
        if(salarioAnual <= 34712){
            imposto = 9.70/100;
            valorImposto = salarioAnual * imposto;
        }else if (salarioAnual >= 34713 && salarioAnual<= 68507) {
            imposto = 37.35/100;
            valorImposto = salarioAnual * imposto;
        }else{
            imposto = 49.50/100;
            valorImposto = salarioAnual * imposto;
        }
        System.out.println("Seu salário anual é de: " +salarioAnual+ " Então você pagara: "+valorImposto+ " De imposto.");


    }
}
