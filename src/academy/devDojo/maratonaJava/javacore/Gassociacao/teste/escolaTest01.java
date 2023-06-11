package academy.devDojo.maratonaJava.javacore.Gassociacao.teste;

import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Escola;
import academy.devDojo.maratonaJava.javacore.Gassociacao.dominio.Professor;

public class escolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Escola escola = new Escola("CSE");
        Professor[] professores = new Professor[]{professor1,professor2};
        escola.setProfessores(professores);
        escola.imprime();
    }
}
