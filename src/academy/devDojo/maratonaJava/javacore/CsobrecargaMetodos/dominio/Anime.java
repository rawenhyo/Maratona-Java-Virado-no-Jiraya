package academy.devDojo.maratonaJava.javacore.CsobrecargaMetodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private String tipo;
    private int episodios;

    public void init(String nome, String genero, int episodios){
        this.nome= nome;
        this.genero = genero;
        this.episodios = episodios;
    }
    public void init(String nome, String genero, int episodios, String tipo){
        init(nome, genero, episodios);
        this.tipo = tipo;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEpisodios() {
        return episodios;
    }


}
