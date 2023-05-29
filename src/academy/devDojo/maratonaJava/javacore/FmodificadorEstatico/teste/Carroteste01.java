package academy.devDojo.maratonaJava.javacore.FmodificadorEstatico.teste;

import academy.devDojo.maratonaJava.javacore.FmodificadorEstatico.dominio.Carro;

public class Carroteste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 300);
        Carro c3 = new Carro("Porsche", 350);


        Carro.setVelocidadeLimite(200);
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

    }



}
