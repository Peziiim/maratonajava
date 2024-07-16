package maratonajavadevdojo.assossiacao;

public class Seminario {
    private String titulo;
    private Local local;
    private Aluno [] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno [] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public Local getLocal() {
        return local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
