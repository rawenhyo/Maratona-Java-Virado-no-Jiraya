package academy.devDojo.maratonaJava.exercicioSeminario.dominio;

public class seminario {
    private String titulo;
    private aluno[] alunos;
    private local local;

    public seminario(String titulo) {
        this.titulo = titulo;
    }

    public seminario(String titulo, aluno[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public seminario(String titulo, aluno[] alunos, academy.devDojo.maratonaJava.exercicioSeminario.dominio.local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public academy.devDojo.maratonaJava.exercicioSeminario.dominio.local getLocal() {
        return local;
    }

    public void setLocal(academy.devDojo.maratonaJava.exercicioSeminario.dominio.local local) {
        this.local = local;
    }
}
