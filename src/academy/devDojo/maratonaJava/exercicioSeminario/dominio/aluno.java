package academy.devDojo.maratonaJava.exercicioSeminario.dominio;

public class aluno {
    private String nome;
    private int idade;
    private seminario seminario;
    public String getNome() {
        return nome;
    }

    public aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(seminario seminario) {
        this.seminario = seminario;
    }
}
