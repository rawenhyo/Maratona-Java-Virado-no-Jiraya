package academy.devDojo.maratonaJava.javacore.Kenum.teste;

import academy.devDojo.maratonaJava.javacore.Kenum.dominio.Cliente;
import academy.devDojo.maratonaJava.javacore.Kenum.dominio.TipoCliente;

public class clienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rawenhyo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Rawenhyo",TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
