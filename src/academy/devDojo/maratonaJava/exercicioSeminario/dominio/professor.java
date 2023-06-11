package academy.devDojo.maratonaJava.exercicioSeminario.dominio;

public class professor {
    private String nome;
    private String especialidade;
    private seminario[] seminarios;


    public professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
