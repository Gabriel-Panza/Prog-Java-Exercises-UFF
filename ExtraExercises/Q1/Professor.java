package ExtraExercises.Q1;

public class Professor extends Funcionario {
    private int nivel;

    public Professor(String nome, String cpf, int idade, double avaliacao, int nivel) {
        super(nome, cpf, idade, avaliacao);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}