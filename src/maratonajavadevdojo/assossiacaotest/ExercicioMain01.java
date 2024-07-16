package maratonajavadevdojo.assossiacaotest;

import maratonajavadevdojo.assossiacao.*;

public class ExercicioMain01 {
    public static void main(String[] args) {
        Local local = new Local("São joão");
        Aluno aluno = new Aluno("João", 16);
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("UNEP", local, alunosParaSeminario);
        Professor professor = new Professor("Roberto");
        ImprimirSeminario imprimirSeminario = new ImprimirSeminario(seminario, local, professor, aluno);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        imprimirSeminario.imprime();


    }
}
