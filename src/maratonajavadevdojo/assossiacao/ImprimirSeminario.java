package maratonajavadevdojo.assossiacao;

public class ImprimirSeminario {
    private Seminario seminario;
    private Local local;
    private Professor professor;
    private Aluno aluno;

    public ImprimirSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public ImprimirSeminario(Seminario seminario, Local local) {
        this.seminario = seminario;
        this.local = local;
    }

    public ImprimirSeminario(Seminario seminario, Local local, Professor professor, Aluno aluno) {
        this.seminario = seminario;
        this.local = local;
        this.professor = professor;
        this.aluno = aluno;
    }

    public void imprime(){
        System.out.println("------------------------------------");
        System.out.println("Professor "+ this.professor.getNome());
        System.out.println("Aluno "+ this.aluno.getNome());
        System.out.println("Seminário "+ this.seminario.getTitulo());
        System.out.println("Local " + this.local.getEndereco());
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
